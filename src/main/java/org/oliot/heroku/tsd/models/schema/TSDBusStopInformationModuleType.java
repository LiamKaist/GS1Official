package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSD_BusStopInformationModuleType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSD_BusStopInformationModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_AddressType"/>
 *         &lt;element name="dateModified" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_SingleStringValueMetaType"/>
 *         &lt;element name="geolocation" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_GeoJSONLocationType"/>
 *         &lt;element name="name" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_SingleStringValueMetaType"/>
 *         &lt;element name="refBusLines" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_MultipleStringValueMetaType"/>
 *         &lt;element name="shortID" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_SingleStringValueMetaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_BusStopInformationModuleType", namespace = "urn:gs1:tsd:bus_stop_information_module:xsd:1", propOrder = {
    "address",
    "dateModified",
    "geolocation",
    "name",
    "refBusLines",
    "shortID"
})
public class TSDBusStopInformationModuleType {

    @XmlElement(required = true)
    protected TSDAddressType address;
    @XmlElement(required = true)
    protected TSDSingleStringValueMetaType dateModified;
    @XmlElement(required = true)
    protected TSDGeoJSONLocationType geolocation;
    @XmlElement(required = true)
    protected TSDSingleStringValueMetaType name;
    @XmlElement(required = true)
    protected TSDMultipleStringValueMetaType refBusLines;
    @XmlElement(required = true)
    protected TSDSingleStringValueMetaType shortID;

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link TSDAddressType }
     *
     */
    public TSDAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDAddressType }
     *
     */
    public void setAddress(TSDAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the dateModified property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleStringValueMetaType }
     *
     */
    public TSDSingleStringValueMetaType getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleStringValueMetaType }
     *
     */
    public void setDateModified(TSDSingleStringValueMetaType value) {
        this.dateModified = value;
    }

    /**
     * Gets the value of the geolocation property.
     *
     * @return
     *     possible object is
     *     {@link TSDGeoJSONLocationType }
     *
     */
    public TSDGeoJSONLocationType getGeolocation() {
        return geolocation;
    }

    /**
     * Sets the value of the geolocation property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDGeoJSONLocationType }
     *
     */
    public void setGeolocation(TSDGeoJSONLocationType value) {
        this.geolocation = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleStringValueMetaType }
     *
     */
    public TSDSingleStringValueMetaType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleStringValueMetaType }
     *
     */
    public void setName(TSDSingleStringValueMetaType value) {
        this.name = value;
    }

    /**
     * Gets the value of the refBusLines property.
     *
     * @return
     *     possible object is
     *     {@link TSDMultipleStringValueMetaType }
     *
     */
    public TSDMultipleStringValueMetaType getRefBusLines() {
        return refBusLines;
    }

    /**
     * Sets the value of the refBusLines property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDMultipleStringValueMetaType }
     *
     */
    public void setRefBusLines(TSDMultipleStringValueMetaType value) {
        this.refBusLines = value;
    }

    /**
     * Gets the value of the shortID property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleStringValueMetaType }
     *
     */
    public TSDSingleStringValueMetaType getShortID() {
        return shortID;
    }

    /**
     * Sets the value of the shortID property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleStringValueMetaType }
     *
     */
    public void setShortID(TSDSingleStringValueMetaType value) {
        this.shortID = value;
    }

}
