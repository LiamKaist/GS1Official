
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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TSD_NutrientDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_NutrientDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nutrientTypeCode" type="{urn:gs1:tsd:nutritional_product_information_module:xsd:1}TSD_NutrientTypeCodeType"/>
 *         &lt;element name="dailyValueIntakePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="measurementPrecision" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_MeasurementPrecisionCodeType" minOccurs="0"/>
 *         &lt;element name="quantityContained" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_NutrientDetailType", namespace = "urn:gs1:tsd:nutritional_product_information_module:xsd:1", propOrder = {
    "nutrientTypeCode",
    "dailyValueIntakePercent",
    "measurementPrecision",
    "quantityContained",
    "avpList"
})
public class TSDNutrientDetailType {

    @XmlElement(required = true)
    protected TSDNutrientTypeCodeType nutrientTypeCode;
    protected BigDecimal dailyValueIntakePercent;
    protected TSDMeasurementPrecisionCodeType measurementPrecision;
    protected List<MeasurementType> quantityContained;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the nutrientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDNutrientTypeCodeType }
     *     
     */
    public TSDNutrientTypeCodeType getNutrientTypeCode() {
        return nutrientTypeCode;
    }

    /**
     * Sets the value of the nutrientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDNutrientTypeCodeType }
     *     
     */
    public void setNutrientTypeCode(TSDNutrientTypeCodeType value) {
        this.nutrientTypeCode = value;
    }

    /**
     * Gets the value of the dailyValueIntakePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyValueIntakePercent() {
        return dailyValueIntakePercent;
    }

    /**
     * Sets the value of the dailyValueIntakePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyValueIntakePercent(BigDecimal value) {
        this.dailyValueIntakePercent = value;
    }

    /**
     * Gets the value of the measurementPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public TSDMeasurementPrecisionCodeType getMeasurementPrecision() {
        return measurementPrecision;
    }

    /**
     * Sets the value of the measurementPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public void setMeasurementPrecision(TSDMeasurementPrecisionCodeType value) {
        this.measurementPrecision = value;
    }

    /**
     * Gets the value of the quantityContained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityContained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityContained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getQuantityContained() {
        if (quantityContained == null) {
            quantityContained = new ArrayList<MeasurementType>();
        }
        return this.quantityContained;
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
