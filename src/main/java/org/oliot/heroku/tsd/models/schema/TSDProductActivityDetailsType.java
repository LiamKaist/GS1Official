
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
 * <p>Java class for TSD_ProductActivityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductActivityDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productActivityTypeCode" type="{urn:gs1:tsd:product_origin_information_module:xsd:1}TSD_ProductActivityTypeCodeType"/>
 *         &lt;element name="activityRegionDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countryOfActivity" type="{urn:gs1:tsd:product_origin_information_module:xsd:1}TSD_CountryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_ProductActivityDetailsType", namespace = "urn:gs1:tsd:product_origin_information_module:xsd:1", propOrder = {
    "productActivityTypeCode",
    "activityRegionDescription",
    "countryOfActivity",
    "avpList"
})
public class TSDProductActivityDetailsType {

    @XmlElement(required = true)
    protected TSDProductActivityTypeCodeType productActivityTypeCode;
    protected List<Description200Type> activityRegionDescription;
    protected List<TSDCountryType> countryOfActivity;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the productActivityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDProductActivityTypeCodeType }
     *     
     */
    public TSDProductActivityTypeCodeType getProductActivityTypeCode() {
        return productActivityTypeCode;
    }

    /**
     * Sets the value of the productActivityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDProductActivityTypeCodeType }
     *     
     */
    public void setProductActivityTypeCode(TSDProductActivityTypeCodeType value) {
        this.productActivityTypeCode = value;
    }

    /**
     * Gets the value of the activityRegionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityRegionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityRegionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getActivityRegionDescription() {
        if (activityRegionDescription == null) {
            activityRegionDescription = new ArrayList<Description200Type>();
        }
        return this.activityRegionDescription;
    }

    /**
     * Gets the value of the countryOfActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDCountryType }
     * 
     * 
     */
    public List<TSDCountryType> getCountryOfActivity() {
        if (countryOfActivity == null) {
            countryOfActivity = new ArrayList<TSDCountryType>();
        }
        return this.countryOfActivity;
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
