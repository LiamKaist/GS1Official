
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


/**
 * <p>Java class for CurrencyExchangeRateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyExchangeRateInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyConversionFromCode" type="{urn:gs1:shared:shared_common:xsd:3}CurrencyCodeType"/>
 *         &lt;element name="currencyConversionToCode" type="{urn:gs1:shared:shared_common:xsd:3}CurrencyCodeType"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="exchangeRateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeRateInformationType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "currencyConversionFromCode",
    "currencyConversionToCode",
    "exchangeRate",
    "exchangeRateDateTime"
})
public class CurrencyExchangeRateInformationType {

    @XmlElement(required = true)
    protected CurrencyCodeType currencyConversionFromCode;
    @XmlElement(required = true)
    protected CurrencyCodeType currencyConversionToCode;
    protected Float exchangeRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeRateDateTime;

    /**
     * Gets the value of the currencyConversionFromCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyConversionFromCode() {
        return currencyConversionFromCode;
    }

    /**
     * Sets the value of the currencyConversionFromCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyConversionFromCode(CurrencyCodeType value) {
        this.currencyConversionFromCode = value;
    }

    /**
     * Gets the value of the currencyConversionToCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyConversionToCode() {
        return currencyConversionToCode;
    }

    /**
     * Sets the value of the currencyConversionToCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyConversionToCode(CurrencyCodeType value) {
        this.currencyConversionToCode = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExchangeRate(Float value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDateTime() {
        return exchangeRateDateTime;
    }

    /**
     * Sets the value of the exchangeRateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDateTime(XMLGregorianCalendar value) {
        this.exchangeRateDateTime = value;
    }

}
