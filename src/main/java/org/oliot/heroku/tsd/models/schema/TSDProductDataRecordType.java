
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

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TSD_ProductDataRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductDataRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productionVariantDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" minOccurs="0"/>
 *         &lt;element name="productionVariantEffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="module" type="{urn:gs1:shared:shared_common:xsd:3}ExtensionType" maxOccurs="unbounded"/>
 *         &lt;element name="productComponentRecord" type="{urn:gs1:tsd:product_data:xsd:1}TSD_ProductComponentRecordType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_ProductDataRecordType", namespace = "urn:gs1:tsd:product_data:xsd:1", propOrder = {
    "productionVariantDescription",
    "productionVariantEffectiveDateTime",
    "module",
    "productComponentRecord",
    "avpList"
})
public class TSDProductDataRecordType {

    protected Description70Type productionVariantDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productionVariantEffectiveDateTime;
    @XmlElement(required = true)
    protected List<ExtensionType> module;
    protected List<TSDProductComponentRecordType> productComponentRecord;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the productionVariantDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description70Type }
     *     
     */
    public Description70Type getProductionVariantDescription() {
        return productionVariantDescription;
    }

    /**
     * Sets the value of the productionVariantDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description70Type }
     *     
     */
    public void setProductionVariantDescription(Description70Type value) {
        this.productionVariantDescription = value;
    }

    /**
     * Gets the value of the productionVariantEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionVariantEffectiveDateTime() {
        return productionVariantEffectiveDateTime;
    }

    /**
     * Sets the value of the productionVariantEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionVariantEffectiveDateTime(XMLGregorianCalendar value) {
        this.productionVariantEffectiveDateTime = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the module property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getModule() {
        if (module == null) {
            module = new ArrayList<ExtensionType>();
        }
        return this.module;
    }

    /**
     * Gets the value of the productComponentRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productComponentRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductComponentRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDProductComponentRecordType }
     * 
     * 
     */
    public List<TSDProductComponentRecordType> getProductComponentRecord() {
        if (productComponentRecord == null) {
            productComponentRecord = new ArrayList<TSDProductComponentRecordType>();
        }
        return this.productComponentRecord;
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
