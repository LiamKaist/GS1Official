
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
 * <p>Java class for TSD_PackagingSignatureLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_PackagingSignatureLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyContactRoleCode" type="{urn:gs1:tsd:basic_product_information_module:xsd:1}TSD_PartyContactRoleCodeType"/>
 *         &lt;element name="partyContactName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="partyContactAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="gln" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/>
 *         &lt;element name="communicationChannel" type="{urn:gs1:shared:shared_common:xsd:3}CommunicationChannelType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_PackagingSignatureLineType", namespace = "urn:gs1:tsd:basic_product_information_module:xsd:1", propOrder = {
    "partyContactRoleCode",
    "partyContactName",
    "partyContactAddress",
    "gln",
    "communicationChannel",
    "avpList"
})
public class TSDPackagingSignatureLineType {

    @XmlElement(required = true)
    protected TSDPartyContactRoleCodeType partyContactRoleCode;
    protected String partyContactName;
    protected String partyContactAddress;
    protected String gln;
    protected List<CommunicationChannelType> communicationChannel;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the partyContactRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDPartyContactRoleCodeType }
     *     
     */
    public TSDPartyContactRoleCodeType getPartyContactRoleCode() {
        return partyContactRoleCode;
    }

    /**
     * Sets the value of the partyContactRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDPartyContactRoleCodeType }
     *     
     */
    public void setPartyContactRoleCode(TSDPartyContactRoleCodeType value) {
        this.partyContactRoleCode = value;
    }

    /**
     * Gets the value of the partyContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyContactName() {
        return partyContactName;
    }

    /**
     * Sets the value of the partyContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyContactName(String value) {
        this.partyContactName = value;
    }

    /**
     * Gets the value of the partyContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyContactAddress() {
        return partyContactAddress;
    }

    /**
     * Sets the value of the partyContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyContactAddress(String value) {
        this.partyContactAddress = value;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

    /**
     * Gets the value of the communicationChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationChannelType }
     * 
     * 
     */
    public List<CommunicationChannelType> getCommunicationChannel() {
        if (communicationChannel == null) {
            communicationChannel = new ArrayList<CommunicationChannelType>();
        }
        return this.communicationChannel;
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
