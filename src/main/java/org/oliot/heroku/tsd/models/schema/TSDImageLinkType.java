
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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TSD_ImageLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_ImageLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *               &lt;maxLength value="2500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="imageTypeCode" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ImageTypeCodeType"/>
 *         &lt;element name="languageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imagePixelHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="imagePixelWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
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
@XmlType(name = "TSD_ImageLinkType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "url",
    "imageTypeCode",
    "languageCode",
    "imagePixelHeight",
    "imagePixelWidth",
    "fileSize",
    "avpList"
})
public class TSDImageLinkType {

    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected TSDImageTypeCodeType imageTypeCode;
    protected List<LanguageCodeType> languageCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imagePixelHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imagePixelWidth;
    protected MeasurementType fileSize;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the imageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDImageTypeCodeType }
     *     
     */
    public TSDImageTypeCodeType getImageTypeCode() {
        return imageTypeCode;
    }

    /**
     * Sets the value of the imageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDImageTypeCodeType }
     *     
     */
    public void setImageTypeCode(TSDImageTypeCodeType value) {
        this.imageTypeCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getLanguageCode() {
        if (languageCode == null) {
            languageCode = new ArrayList<LanguageCodeType>();
        }
        return this.languageCode;
    }

    /**
     * Gets the value of the imagePixelHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImagePixelHeight() {
        return imagePixelHeight;
    }

    /**
     * Sets the value of the imagePixelHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImagePixelHeight(BigInteger value) {
        this.imagePixelHeight = value;
    }

    /**
     * Gets the value of the imagePixelWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImagePixelWidth() {
        return imagePixelWidth;
    }

    /**
     * Sets the value of the imagePixelWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImagePixelWidth(BigInteger value) {
        this.imagePixelWidth = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setFileSize(MeasurementType value) {
        this.fileSize = value;
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
