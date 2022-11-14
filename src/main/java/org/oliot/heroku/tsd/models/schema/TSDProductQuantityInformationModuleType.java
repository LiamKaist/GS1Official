
/*
 * Copyright 2017 Open Language for Internet of Things (Oliot)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TSD_ProductQuantityInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductQuantityInformationModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="drainedWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *         &lt;element name="percentageOfAlcoholByVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="servingQuantityInformation" type="{urn:gs1:tsd:product_quantity_information_module:xsd:1}TSD_ServingQuantityInformationType" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ProductQuantityInformationModuleType", namespace = "urn:gs1:tsd:product_quantity_information_module:xsd:1", propOrder = {
    "netContent",
    "drainedWeight",
    "percentageOfAlcoholByVolume",
    "servingQuantityInformation",
    "avpList"
})
public class TSDProductQuantityInformationModuleType {

    protected List<MeasurementType> netContent;
    protected MeasurementType drainedWeight;
    protected BigDecimal percentageOfAlcoholByVolume;
    protected TSDServingQuantityInformationType servingQuantityInformation;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the netContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNetContent() {
        if (netContent == null) {
            netContent = new ArrayList<MeasurementType>();
        }
        return this.netContent;
    }

    /**
     * Gets the value of the drainedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDrainedWeight() {
        return drainedWeight;
    }

    /**
     * Sets the value of the drainedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDrainedWeight(MeasurementType value) {
        this.drainedWeight = value;
    }

    /**
     * Gets the value of the percentageOfAlcoholByVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageOfAlcoholByVolume() {
        return percentageOfAlcoholByVolume;
    }

    /**
     * Sets the value of the percentageOfAlcoholByVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageOfAlcoholByVolume(BigDecimal value) {
        this.percentageOfAlcoholByVolume = value;
    }

    /**
     * Gets the value of the servingQuantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSDServingQuantityInformationType }
     *     
     */
    public TSDServingQuantityInformationType getServingQuantityInformation() {
        return servingQuantityInformation;
    }

    /**
     * Sets the value of the servingQuantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDServingQuantityInformationType }
     *     
     */
    public void setServingQuantityInformation(TSDServingQuantityInformationType value) {
        this.servingQuantityInformation = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public TSDAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public void setAvpList(TSDAttributeValuePairListType value) {
        this.avpList = value;
    }

}
