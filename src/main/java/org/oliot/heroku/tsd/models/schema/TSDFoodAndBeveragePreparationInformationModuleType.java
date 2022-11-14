
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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TSD_FoodAndBeveragePreparationInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_FoodAndBeveragePreparationInformationModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servingSuggestion" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preparationMethod" type="{urn:gs1:tsd:food_and_beverage_preparation_information_module:xsd:1}TSD_PreparationMethodType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_FoodAndBeveragePreparationInformationModuleType", namespace = "urn:gs1:tsd:food_and_beverage_preparation_information_module:xsd:1", propOrder = {
    "servingSuggestion",
    "preparationMethod",
    "avpList"
})
public class TSDFoodAndBeveragePreparationInformationModuleType {

    protected List<Description1000Type> servingSuggestion;
    protected List<TSDPreparationMethodType> preparationMethod;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the servingSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getServingSuggestion() {
        if (servingSuggestion == null) {
            servingSuggestion = new ArrayList<Description1000Type>();
        }
        return this.servingSuggestion;
    }

    /**
     * Gets the value of the preparationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDPreparationMethodType }
     * 
     * 
     */
    public List<TSDPreparationMethodType> getPreparationMethod() {
        if (preparationMethod == null) {
            preparationMethod = new ArrayList<TSDPreparationMethodType>();
        }
        return this.preparationMethod;
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
