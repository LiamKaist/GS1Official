
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


/**
 * <p>Java class for TSD_ServingQuantityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_ServingQuantityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfServingsPerPackage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="measurementPrecisionCode" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_MeasurementPrecisionCodeType" minOccurs="0"/>
 *         &lt;element name="numberOfServingsRangeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" minOccurs="0"/>
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
@XmlType(name = "TSD_ServingQuantityInformationType", namespace = "urn:gs1:tsd:product_quantity_information_module:xsd:1", propOrder = {
    "numberOfServingsPerPackage",
    "measurementPrecisionCode",
    "numberOfServingsRangeDescription",
    "avpList"
})
public class TSDServingQuantityInformationType {

    protected BigDecimal numberOfServingsPerPackage;
    protected TSDMeasurementPrecisionCodeType measurementPrecisionCode;
    protected Description70Type numberOfServingsRangeDescription;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the numberOfServingsPerPackage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfServingsPerPackage() {
        return numberOfServingsPerPackage;
    }

    /**
     * Sets the value of the numberOfServingsPerPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfServingsPerPackage(BigDecimal value) {
        this.numberOfServingsPerPackage = value;
    }

    /**
     * Gets the value of the measurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public TSDMeasurementPrecisionCodeType getMeasurementPrecisionCode() {
        return measurementPrecisionCode;
    }

    /**
     * Sets the value of the measurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public void setMeasurementPrecisionCode(TSDMeasurementPrecisionCodeType value) {
        this.measurementPrecisionCode = value;
    }

    /**
     * Gets the value of the numberOfServingsRangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description70Type }
     *     
     */
    public Description70Type getNumberOfServingsRangeDescription() {
        return numberOfServingsRangeDescription;
    }

    /**
     * Sets the value of the numberOfServingsRangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description70Type }
     *     
     */
    public void setNumberOfServingsRangeDescription(Description70Type value) {
        this.numberOfServingsRangeDescription = value;
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
