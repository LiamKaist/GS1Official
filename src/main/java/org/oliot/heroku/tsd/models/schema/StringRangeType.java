
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringRangeType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "maximumValue",
    "minimumValue"
})
public class StringRangeType {

    protected String maximumValue;
    protected String minimumValue;

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumValue(String value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumValue(String value) {
        this.minimumValue = value;
    }

}
