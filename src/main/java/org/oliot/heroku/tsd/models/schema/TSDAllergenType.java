
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


/**
 * <p>Java class for TSD_AllergenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_AllergenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergenTypeCode" type="{urn:gs1:tsd:product_allergen_information_module:xsd:1}TSD_AllergenTypeCodeType"/>
 *         &lt;element name="levelOfContainmentCode" type="{urn:gs1:tsd:product_allergen_information_module:xsd:1}TSD_LevelOfContainmentCodeType"/>
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
@XmlType(name = "TSD_AllergenType", namespace = "urn:gs1:tsd:product_allergen_information_module:xsd:1", propOrder = {
    "allergenTypeCode",
    "levelOfContainmentCode",
    "avpList"
})
public class TSDAllergenType {

    @XmlElement(required = true)
    protected TSDAllergenTypeCodeType allergenTypeCode;
    @XmlElement(required = true)
    protected TSDLevelOfContainmentCodeType levelOfContainmentCode;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the allergenTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDAllergenTypeCodeType }
     *     
     */
    public TSDAllergenTypeCodeType getAllergenTypeCode() {
        return allergenTypeCode;
    }

    /**
     * Sets the value of the allergenTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAllergenTypeCodeType }
     *     
     */
    public void setAllergenTypeCode(TSDAllergenTypeCodeType value) {
        this.allergenTypeCode = value;
    }

    /**
     * Gets the value of the levelOfContainmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDLevelOfContainmentCodeType }
     *     
     */
    public TSDLevelOfContainmentCodeType getLevelOfContainmentCode() {
        return levelOfContainmentCode;
    }

    /**
     * Sets the value of the levelOfContainmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDLevelOfContainmentCodeType }
     *     
     */
    public void setLevelOfContainmentCode(TSDLevelOfContainmentCodeType value) {
        this.levelOfContainmentCode = value;
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
