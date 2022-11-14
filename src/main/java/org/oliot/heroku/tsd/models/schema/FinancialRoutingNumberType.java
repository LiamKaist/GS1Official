
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
 * <p>Java class for FinancialRoutingNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRoutingNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financialRoutingNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="financialRoutingNumberTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}FinancialRoutingNumberTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRoutingNumberType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "financialRoutingNumber",
    "financialRoutingNumberTypeCode"
})
public class FinancialRoutingNumberType {

    @XmlElement(required = true)
    protected String financialRoutingNumber;
    @XmlElement(required = true)
    protected FinancialRoutingNumberTypeCodeType financialRoutingNumberTypeCode;

    /**
     * Gets the value of the financialRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialRoutingNumber() {
        return financialRoutingNumber;
    }

    /**
     * Sets the value of the financialRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialRoutingNumber(String value) {
        this.financialRoutingNumber = value;
    }

    /**
     * Gets the value of the financialRoutingNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRoutingNumberTypeCodeType }
     *     
     */
    public FinancialRoutingNumberTypeCodeType getFinancialRoutingNumberTypeCode() {
        return financialRoutingNumberTypeCode;
    }

    /**
     * Sets the value of the financialRoutingNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRoutingNumberTypeCodeType }
     *     
     */
    public void setFinancialRoutingNumberTypeCode(FinancialRoutingNumberTypeCodeType value) {
        this.financialRoutingNumberTypeCode = value;
    }

}
