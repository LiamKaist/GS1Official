
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
 * <p>Java class for CommunicationChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communicationChannelCode" type="{urn:gs1:shared:shared_common:xsd:3}CommunicationChannelCodeType"/>
 *         &lt;element name="communicationValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="communicationChannelName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannelType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "communicationChannelCode",
    "communicationValue",
    "communicationChannelName"
})
public class CommunicationChannelType {

    @XmlElement(required = true)
    protected CommunicationChannelCodeType communicationChannelCode;
    @XmlElement(required = true)
    protected String communicationValue;
    protected String communicationChannelName;

    /**
     * Gets the value of the communicationChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannelCodeType }
     *     
     */
    public CommunicationChannelCodeType getCommunicationChannelCode() {
        return communicationChannelCode;
    }

    /**
     * Sets the value of the communicationChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannelCodeType }
     *     
     */
    public void setCommunicationChannelCode(CommunicationChannelCodeType value) {
        this.communicationChannelCode = value;
    }

    /**
     * Gets the value of the communicationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationValue() {
        return communicationValue;
    }

    /**
     * Sets the value of the communicationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationValue(String value) {
        this.communicationValue = value;
    }

    /**
     * Gets the value of the communicationChannelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationChannelName() {
        return communicationChannelName;
    }

    /**
     * Sets the value of the communicationChannelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationChannelName(String value) {
        this.communicationChannelName = value;
    }

}
