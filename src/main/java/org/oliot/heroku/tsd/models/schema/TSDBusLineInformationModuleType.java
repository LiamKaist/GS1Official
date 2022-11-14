package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSD_BusLineInformationModuleType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSD_BusLineInformationModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refBusStops" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_MultipleValueMetaType"/>
 *         &lt;element name="localID" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="shortID" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="name" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="refStartBusStop" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="refEndBusStop" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="busLineType" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="startTime" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="endTime" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="intervalNorm" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="intervalHoli" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="intervalPeak" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *         &lt;element name="dateModified" type="{urn:gs1:tsd:bus_line_information_module:xsd:1}TSD_SingleValueMetaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_BusLineInformationModuleType", namespace = "urn:gs1:tsd:bus_line_information_module:xsd:1", propOrder = {
    "refBusStops",
    "localID",
    "shortID",
    "name",
    "refStartBusStop",
    "refEndBusStop",
    "busLineType",
    "startTime",
    "endTime",
    "intervalNorm",
    "intervalHoli",
    "intervalPeak",
    "dateModified"
})
public class TSDBusLineInformationModuleType {

    @XmlElement(required = true)
    protected TSDMultipleValueMetaType refBusStops;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType localID;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType shortID;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType name;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType refStartBusStop;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType refEndBusStop;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType busLineType;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType startTime;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType endTime;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType intervalNorm;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType intervalHoli;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType intervalPeak;
    @XmlElement(required = true)
    protected TSDSingleValueMetaType dateModified;

    /**
     * Gets the value of the refBusStops property.
     *
     * @return
     *     possible object is
     *     {@link TSDMultipleValueMetaType }
     *
     */
    public TSDMultipleValueMetaType getRefBusStops() {
        return refBusStops;
    }

    /**
     * Sets the value of the refBusStops property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDMultipleValueMetaType }
     *
     */
    public void setRefBusStops(TSDMultipleValueMetaType value) {
        this.refBusStops = value;
    }

    /**
     * Gets the value of the localID property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getLocalID() {
        return localID;
    }

    /**
     * Sets the value of the localID property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setLocalID(TSDSingleValueMetaType value) {
        this.localID = value;
    }

    /**
     * Gets the value of the shortID property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getShortID() {
        return shortID;
    }

    /**
     * Sets the value of the shortID property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setShortID(TSDSingleValueMetaType value) {
        this.shortID = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setName(TSDSingleValueMetaType value) {
        this.name = value;
    }

    /**
     * Gets the value of the refStartBusStop property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getRefStartBusStop() {
        return refStartBusStop;
    }

    /**
     * Sets the value of the refStartBusStop property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setRefStartBusStop(TSDSingleValueMetaType value) {
        this.refStartBusStop = value;
    }

    /**
     * Gets the value of the refEndBusStop property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getRefEndBusStop() {
        return refEndBusStop;
    }

    /**
     * Sets the value of the refEndBusStop property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setRefEndBusStop(TSDSingleValueMetaType value) {
        this.refEndBusStop = value;
    }

    /**
     * Gets the value of the busLineType property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getBusLineType() {
        return busLineType;
    }

    /**
     * Sets the value of the busLineType property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setBusLineType(TSDSingleValueMetaType value) {
        this.busLineType = value;
    }

    /**
     * Gets the value of the startTime property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setStartTime(TSDSingleValueMetaType value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setEndTime(TSDSingleValueMetaType value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the intervalNorm property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getIntervalNorm() {
        return intervalNorm;
    }

    /**
     * Sets the value of the intervalNorm property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setIntervalNorm(TSDSingleValueMetaType value) {
        this.intervalNorm = value;
    }

    /**
     * Gets the value of the intervalHoli property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getIntervalHoli() {
        return intervalHoli;
    }

    /**
     * Sets the value of the intervalHoli property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setIntervalHoli(TSDSingleValueMetaType value) {
        this.intervalHoli = value;
    }

    /**
     * Gets the value of the intervalPeak property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getIntervalPeak() {
        return intervalPeak;
    }

    /**
     * Sets the value of the intervalPeak property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setIntervalPeak(TSDSingleValueMetaType value) {
        this.intervalPeak = value;
    }

    /**
     * Gets the value of the dateModified property.
     *
     * @return
     *     possible object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public TSDSingleValueMetaType getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     *
     * @param value
     *     allowed object is
     *     {@link TSDSingleValueMetaType }
     *
     */
    public void setDateModified(TSDSingleValueMetaType value) {
        this.dateModified = value;
    }

}
