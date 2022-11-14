
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

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TSD_ProductDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSD_ProductDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epcURI" type="{urn:gs1:shared:shared_common:xsd:3}EPCURIType"/>
 *         &lt;element name="targetMarket" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType"/>
 *         &lt;element name="informationProviderGLN" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/>
 *         &lt;element name="informationProviderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeToLive" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="productDataRecord" type="{urn:gs1:tsd:product_data:xsd:1}TSD_ProductDataRecordType" maxOccurs="unbounded"/>
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
@XmlType(name = "TSD_ProductDataType", namespace = "urn:gs1:tsd:liam_test_module:xsd:1", propOrder = {
    "epcURI",
    "targetMarket",
    "informationProviderGLN",
    "informationProviderName",
    "timeToLive",
    "productDataRecord",
    "avpList"
})

public class TSDProductDataType {
    @Id
    @XmlTransient
    private final String id = null;

    @XmlElement(required = true)
    protected String epcURI;
    @XmlElement(required = true)
    protected CountryCodeType targetMarket;
    @XmlElement(required = true)
    protected String informationProviderGLN;
    @XmlElement(required = true)
    protected String informationProviderName;
    protected Duration timeToLive;
    @XmlElement(required = true)
    protected List<TSDProductDataRecordType> productDataRecord;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the epcURI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEpcURI() {
        return epcURI;
    }

    /**
     * Sets the value of the epcURI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEpcURI(String value) {
        this.epcURI = value;
    }

    /**
     * Gets the value of the targetMarket property.
     *
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *
     */
    public CountryCodeType getTargetMarket() {
        return targetMarket;
    }

    /**
     * Sets the value of the targetMarket property.
     *
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *
     */
    public void setTargetMarket(CountryCodeType value) {
        this.targetMarket = value;
    }

    /**
     * Gets the value of the informationProviderGLN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInformationProviderGLN() {
        return informationProviderGLN;
    }

    /**
     * Sets the value of the informationProviderGLN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInformationProviderGLN(String value) {
        this.informationProviderGLN = value;
    }

    /**
     * Gets the value of the informationProviderName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInformationProviderName() {
        return informationProviderName;
    }

    /**
     * Sets the value of the informationProviderName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInformationProviderName(String value) {
        this.informationProviderName = value;
    }

    /**
     * Gets the value of the timeToLive property.
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *
     */
    public void setTimeToLive(Duration value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the productDataRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDataRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDataRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDProductDataRecordType }
     *
     *
     */
    public List<TSDProductDataRecordType> getProductDataRecord() {
        if (productDataRecord == null) {
            productDataRecord = new ArrayList<TSDProductDataRecordType>();
        }
        return this.productDataRecord;
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
