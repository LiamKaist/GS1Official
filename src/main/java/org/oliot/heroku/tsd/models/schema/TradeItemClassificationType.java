
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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TradeItemClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpcCategoryCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionalTradeItemClassificationCode" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalTradeItemClassificationCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gpcCategoryName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="105"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="gpcAttribute" type="{urn:gs1:shared:shared_common:xsd:3}GPCAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemClassificationType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "gpcCategoryCode",
    "additionalTradeItemClassificationCode",
    "gpcCategoryName",
    "gpcAttribute"
})
public class TradeItemClassificationType {

    @XmlElement(required = true)
    protected String gpcCategoryCode;
    protected List<AdditionalTradeItemClassificationCodeType> additionalTradeItemClassificationCode;
    protected String gpcCategoryName;
    protected List<GPCAttributeType> gpcAttribute;

    /**
     * Gets the value of the gpcCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryCode() {
        return gpcCategoryCode;
    }

    /**
     * Sets the value of the gpcCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryCode(String value) {
        this.gpcCategoryCode = value;
    }

    /**
     * Gets the value of the additionalTradeItemClassificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemClassificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemClassificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTradeItemClassificationCodeType }
     * 
     * 
     */
    public List<AdditionalTradeItemClassificationCodeType> getAdditionalTradeItemClassificationCode() {
        if (additionalTradeItemClassificationCode == null) {
            additionalTradeItemClassificationCode = new ArrayList<AdditionalTradeItemClassificationCodeType>();
        }
        return this.additionalTradeItemClassificationCode;
    }

    /**
     * Gets the value of the gpcCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryName() {
        return gpcCategoryName;
    }

    /**
     * Sets the value of the gpcCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryName(String value) {
        this.gpcCategoryName = value;
    }

    /**
     * Gets the value of the gpcAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gpcAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGpcAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GPCAttributeType }
     * 
     * 
     */
    public List<GPCAttributeType> getGpcAttribute() {
        if (gpcAttribute == null) {
            gpcAttribute = new ArrayList<GPCAttributeType>();
        }
        return this.gpcAttribute;
    }

}
