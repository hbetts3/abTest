//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.19 at 06:41:43 PM EST 
//


package org.hbetts.ab;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ContactTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contact"
})
@XmlRootElement(name = "AddressBook")
public class AddressBook {

    @XmlElement(name = "Contact")
    protected List<AddressBook.Contact> contact;

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressBook.Contact }
     * 
     * 
     */
    public List<AddressBook.Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<AddressBook.Contact>();
        }
        return this.contact;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ContactTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerID",
        "companyName",
        "contactName",
        "contactTitle",
        "address",
        "city",
        "email",
        "region",
        "postalCode",
        "country",
        "phone",
        "fax"
    })
    public static class Contact {

        @XmlElement(name = "CustomerID", required = true)
        protected String customerID;
        @XmlElement(name = "CompanyName", required = true)
        protected String companyName;
        @XmlElement(name = "ContactName", required = true)
        protected String contactName;
        @XmlElement(name = "ContactTitle", required = true)
        protected String contactTitle;
        @XmlElement(name = "Address", required = true)
        protected String address;
        @XmlElement(name = "City", required = true)
        protected String city;
        @XmlElement(name = "Email", required = true)
        protected String email;
        @XmlElement(name = "Region")
        protected String region;
        @XmlElement(name = "PostalCode")
        protected String postalCode;
        @XmlElement(name = "Country", required = true)
        protected String country;
        @XmlElement(name = "Phone", required = true)
        protected String phone;
        @XmlElement(name = "Fax")
        protected String fax;

        /**
         * Gets the value of the customerID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerID() {
            return customerID;
        }

        /**
         * Sets the value of the customerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerID(String value) {
            this.customerID = value;
        }

        /**
         * Gets the value of the companyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Sets the value of the companyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Gets the value of the contactName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactName() {
            return contactName;
        }

        /**
         * Sets the value of the contactName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactName(String value) {
            this.contactName = value;
        }

        /**
         * Gets the value of the contactTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactTitle() {
            return contactTitle;
        }

        /**
         * Sets the value of the contactTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactTitle(String value) {
            this.contactTitle = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the region property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax() {
            return fax;
        }

        /**
         * Sets the value of the fax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax(String value) {
            this.fax = value;
        }

    }

}