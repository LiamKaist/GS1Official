
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
 * <p>Java class for GPCAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPCAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpcAttributeTypeCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="gpcAttributeValueCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="gpcAttributeTypeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="105"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="gpcAttributeValueName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="105"/>
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
@XmlType(name = "GPCAttributeType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "gpcAttributeTypeCode",
    "gpcAttributeValueCode",
    "gpcAttributeTypeName",
    "gpcAttributeValueName"
})
public class GPCAttributeType {

    @XmlElement(required = true)
    protected String gpcAttributeTypeCode;
    @XmlElement(required = true)
    protected String gpcAttributeValueCode;
    protected String gpcAttributeTypeName;
    protected String gpcAttributeValueName;

    /**
     * Gets the value of the gpcAttributeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeTypeCode() {
        return gpcAttributeTypeCode;
    }

    /**
     * Sets the value of the gpcAttributeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeTypeCode(String value) {
        this.gpcAttributeTypeCode = value;
    }

    /**
     * Gets the value of the gpcAttributeValueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeValueCode() {
        return gpcAttributeValueCode;
    }

    /**
     * Sets the value of the gpcAttributeValueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeValueCode(String value) {
        this.gpcAttributeValueCode = value;
    }

    /**
     * Gets the value of the gpcAttributeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeTypeName() {
        return gpcAttributeTypeName;
    }

    /**
     * Sets the value of the gpcAttributeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeTypeName(String value) {
        this.gpcAttributeTypeName = value;
    }

    /**
     * Gets the value of the gpcAttributeValueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeValueName() {
        return gpcAttributeValueName;
    }

    /**
     * Sets the value of the gpcAttributeValueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeValueName(String value) {
        this.gpcAttributeValueName = value;
    }

}
