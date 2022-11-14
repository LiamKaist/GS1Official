package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSD_AddressValueType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSD_AddressValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressLocality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_AddressValueType", namespace = "urn:gs1:tsd:bus_stop_information_module:xsd:1", propOrder = {
    "type",
    "addressLocality",
    "addressRegion",
    "postalCode",
    "streetAddress"
})
public class TSDAddressValueType {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String addressLocality;
    @XmlElement(required = true)
    protected String addressRegion;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String streetAddress;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the addressLocality property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLocality() {
        return addressLocality;
    }

    /**
     * Sets the value of the addressLocality property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLocality(String value) {
        this.addressLocality = value;
    }

    /**
     * Gets the value of the addressRegion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressRegion() {
        return addressRegion;
    }

    /**
     * Sets the value of the addressRegion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressRegion(String value) {
        this.addressRegion = value;
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
     * Gets the value of the streetAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

}
