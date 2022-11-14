
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
 * <p>Java class for TargetMarketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetMarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetMarketCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType"/>
 *         &lt;element name="targetMarketSubdivisionCode" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarketType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "targetMarketCountryCode",
    "targetMarketSubdivisionCode"
})
public class TargetMarketType {

    @XmlElement(required = true)
    protected CountryCodeType targetMarketCountryCode;
    protected CountrySubdivisionCodeType targetMarketSubdivisionCode;

    /**
     * Gets the value of the targetMarketCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getTargetMarketCountryCode() {
        return targetMarketCountryCode;
    }

    /**
     * Sets the value of the targetMarketCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setTargetMarketCountryCode(CountryCodeType value) {
        this.targetMarketCountryCode = value;
    }

    /**
     * Gets the value of the targetMarketSubdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public CountrySubdivisionCodeType getTargetMarketSubdivisionCode() {
        return targetMarketSubdivisionCode;
    }

    /**
     * Sets the value of the targetMarketSubdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public void setTargetMarketSubdivisionCode(CountrySubdivisionCodeType value) {
        this.targetMarketSubdivisionCode = value;
    }

}
