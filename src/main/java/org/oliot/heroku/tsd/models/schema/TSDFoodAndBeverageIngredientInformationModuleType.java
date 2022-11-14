
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
 * <p>Java class for TSD_FoodAndBeverageIngredientInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_FoodAndBeverageIngredientInformationModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingredientStatement" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_FormattedDescription5000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additivesStatement" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_FormattedDescription1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="foodAndBeverageIngredient" type="{urn:gs1:tsd:food_and_beverage_information_module:xsd:1}TSD_FoodAndBeverageIngredientType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_FoodAndBeverageIngredientInformationModuleType", namespace = "urn:gs1:tsd:food_and_beverage_information_module:xsd:1", propOrder = {
    "ingredientStatement",
    "additivesStatement",
    "foodAndBeverageIngredient",
    "avpList"
})
public class TSDFoodAndBeverageIngredientInformationModuleType {

    protected List<TSDFormattedDescription5000Type> ingredientStatement;
    protected List<TSDFormattedDescription1000Type> additivesStatement;
    protected List<TSDFoodAndBeverageIngredientType> foodAndBeverageIngredient;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the ingredientStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFormattedDescription5000Type }
     * 
     * 
     */
    public List<TSDFormattedDescription5000Type> getIngredientStatement() {
        if (ingredientStatement == null) {
            ingredientStatement = new ArrayList<TSDFormattedDescription5000Type>();
        }
        return this.ingredientStatement;
    }

    /**
     * Gets the value of the additivesStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additivesStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditivesStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFormattedDescription1000Type }
     * 
     * 
     */
    public List<TSDFormattedDescription1000Type> getAdditivesStatement() {
        if (additivesStatement == null) {
            additivesStatement = new ArrayList<TSDFormattedDescription1000Type>();
        }
        return this.additivesStatement;
    }

    /**
     * Gets the value of the foodAndBeverageIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodAndBeverageIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodAndBeverageIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFoodAndBeverageIngredientType }
     * 
     * 
     */
    public List<TSDFoodAndBeverageIngredientType> getFoodAndBeverageIngredient() {
        if (foodAndBeverageIngredient == null) {
            foodAndBeverageIngredient = new ArrayList<TSDFoodAndBeverageIngredientType>();
        }
        return this.foodAndBeverageIngredient;
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
