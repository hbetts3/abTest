package org.hbetts.ab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddressBookParser {
	private static final int ALL_GOOD = 0;
	private static final int BAD = -1;
	private static final String XML_FORMAT = "XML";
	private static final String JSON_FORMAT = "JSON";
	private static String fileName;
	private static String inForm;
	private static String outForm;
	private static String validate;

	public static void main(String[] args) {
		//check for "help"
		for(String arg : args) {
			if(arg.equalsIgnoreCase("help")){
				showHelp(ALL_GOOD);
			}
		}
		
		//validate args
		if (isValid(args)) {
			inForm = args[0];
			outForm = args[1];
			fileName = args[2];
			if(args.length>3) {
				validate = String.valueOf(args[3].equalsIgnoreCase("validate"));
			} else {
				validate = "false";
			}
		}
		
		if(inForm.equalsIgnoreCase(XML_FORMAT)) {
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(AddressBook.class);
				Unmarshaller xmlUnmarshaller = jaxbContext.createUnmarshaller();
				if(Boolean.valueOf(validate)) {
					SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
					Schema s = sf.newSchema(new File("resources\\ab.xsd"));
					xmlUnmarshaller.setSchema(s);
					xmlUnmarshaller.setEventHandler(new SchemaEventValidationHandler());
				}
				AddressBook addressBook = (AddressBook) xmlUnmarshaller.unmarshal(new File(fileName));
				if(Boolean.valueOf(validate)) {
					System.out.println("XML is Valid");
				}
				if(outForm.equalsIgnoreCase(JSON_FORMAT)) {
					ObjectMapper jsonObjectMapper = new ObjectMapper();
					System.out.println(jsonObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(addressBook));		
				} else {
					BufferedReader reader = new BufferedReader(new FileReader(fileName));
					while (reader.ready()) {
						String line = reader.readLine();
						System.out.println(line);
					}
					reader.close();
				}
				
			} catch (JAXBException e) {
				System.out.println("Unable to unmarshall the XML File:("+e.getMessage()+")");
			} catch (JsonProcessingException e) {
				System.out.println("Unable to marshal XML to JSON:(" + e.getMessage() + ")");
				System.exit(-2);
			} catch (SAXException e) {
				System.out.println("Unable to read the schema file.");
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				System.out.println("Unable to find file ("+fileName+")");
				System.exit(-2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static boolean isValid(String[] args) {
		boolean retVal = true;

		if (args[0].equalsIgnoreCase(XML_FORMAT) || args[0].equalsIgnoreCase(JSON_FORMAT)) {
			retVal = true;
		} else {
			System.out.println("Invalid input format");
			showHelp(BAD);
		}

		if (args[1].equalsIgnoreCase(XML_FORMAT) || args[1].equalsIgnoreCase(JSON_FORMAT)) {
			retVal = true;
		} else {
			System.out.println("Invalid output format");
			showHelp(BAD);
		}

		File temp = new File(args[2]);
		if (temp.exists()) {
			retVal = true;
		} else {
			System.out.println("Invalid address book file");
			showHelp(BAD);
		}

		return retVal;
	}

	private static void showHelp(int sysExit) {
		System.out.println("Execute command using the following \"AddressBookParser [input format (xml||json)] "
				+ "[output format (xml||json)] [path\to\file.ext] [validate]\""
				+ "\r\ne.g. AddressBookParser xml json temp\\file.xml validate -- would validate file.xml against the addressbook schema"
				+ "\r\ne.g. AddressBookParser xml json temp\\file.xml -- would print out the address book file.xml as JSON"
				+ "\r\ne.g. AddressBookParser json xml temp\\file.json -- would print out the address book file.json as XML"
				+ "\r\nPlease Note: validate is only valid for xml files and " + "will not produce any output.");
		System.exit(sysExit);
	}

}
