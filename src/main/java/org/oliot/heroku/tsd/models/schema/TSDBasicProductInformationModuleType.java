
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
 * <p>Java class for TSD_BasicProductInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_BasicProductInformationModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productName" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded"/>
 *         &lt;element name="consumerMarketingDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gpcCategoryCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="regulatedProductName" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="brandNameInformation" type="{urn:gs1:tsd:basic_product_information_module:xsd:1}TSD_BrandNameInformationType"/>
 *         &lt;element name="productInformationLink" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ProductInformationLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imageLink" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ImageLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packagingSignatureLine" type="{urn:gs1:tsd:basic_product_information_module:xsd:1}TSD_PackagingSignatureLineType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_BasicProductInformationModuleType", namespace = "urn:gs1:tsd:basic_product_information_module:xsd:1", propOrder = {
    "productName",
    "consumerMarketingDescription",
    "gpcCategoryCode",
    "regulatedProductName",
    "brandNameInformation",
    "productInformationLink",
    "imageLink",
    "packagingSignatureLine",
    "avpList"
})
public class TSDBasicProductInformationModuleType {

    @XmlElement(required = true)
    protected List<Description80Type> productName;
    protected List<Description2500Type> consumerMarketingDescription;
    protected String gpcCategoryCode;
    protected List<Description500Type> regulatedProductName;
    @XmlElement(required = true)
    protected TSDBrandNameInformationType brandNameInformation;
    protected List<TSDProductInformationLinkType> productInformationLink;
    protected List<TSDImageLinkType> imageLink;
    protected List<TSDPackagingSignatureLineType> packagingSignatureLine;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the productName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getProductName() {
        if (productName == null) {
            productName = new ArrayList<Description80Type>();
        }
        return this.productName;
    }

    /**
     * Gets the value of the consumerMarketingDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerMarketingDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerMarketingDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getConsumerMarketingDescription() {
        if (consumerMarketingDescription == null) {
            consumerMarketingDescription = new ArrayList<Description2500Type>();
        }
        return this.consumerMarketingDescription;
    }

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
     * Gets the value of the regulatedProductName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatedProductName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatedProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getRegulatedProductName() {
        if (regulatedProductName == null) {
            regulatedProductName = new ArrayList<Description500Type>();
        }
        return this.regulatedProductName;
    }

    /**
     * Gets the value of the brandNameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSDBrandNameInformationType }
     *     
     */
    public TSDBrandNameInformationType getBrandNameInformation() {
        return brandNameInformation;
    }

    /**
     * Sets the value of the brandNameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDBrandNameInformationType }
     *     
     */
    public void setBrandNameInformation(TSDBrandNameInformationType value) {
        this.brandNameInformation = value;
    }

    /**
     * Gets the value of the productInformationLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformationLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformationLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDProductInformationLinkType }
     * 
     * 
     */
    public List<TSDProductInformationLinkType> getProductInformationLink() {
        if (productInformationLink == null) {
            productInformationLink = new ArrayList<TSDProductInformationLinkType>();
        }
        return this.productInformationLink;
    }

    /**
     * Gets the value of the imageLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDImageLinkType }
     * 
     * 
     */
    public List<TSDImageLinkType> getImageLink() {
        if (imageLink == null) {
            imageLink = new ArrayList<TSDImageLinkType>();
        }
        return this.imageLink;
    }

    /**
     * Gets the value of the packagingSignatureLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingSignatureLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingSignatureLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDPackagingSignatureLineType }
     * 
     * 
     */
    public List<TSDPackagingSignatureLineType> getPackagingSignatureLine() {
        if (packagingSignatureLine == null) {
            packagingSignatureLine = new ArrayList<TSDPackagingSignatureLineType>();
        }
        return this.packagingSignatureLine;
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
