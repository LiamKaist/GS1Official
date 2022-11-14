
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
 * <p>Java class for SizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SizeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptiveSize" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" minOccurs="0"/>
 *         &lt;element name="sizeCode" type="{urn:gs1:shared:shared_common:xsd:3}SizeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SizeType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "descriptiveSize",
    "sizeCode"
})
public class SizeType {

    protected Description80Type descriptiveSize;
    protected SizeCodeType sizeCode;

    /**
     * Gets the value of the descriptiveSize property.
     * 
     * @return
     *     possible object is
     *     {@link Description80Type }
     *     
     */
    public Description80Type getDescriptiveSize() {
        return descriptiveSize;
    }

    /**
     * Sets the value of the descriptiveSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description80Type }
     *     
     */
    public void setDescriptiveSize(Description80Type value) {
        this.descriptiveSize = value;
    }

    /**
     * Gets the value of the sizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SizeCodeType }
     *     
     */
    public SizeCodeType getSizeCode() {
        return sizeCode;
    }

    /**
     * Sets the value of the sizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeCodeType }
     *     
     */
    public void setSizeCode(SizeCodeType value) {
        this.sizeCode = value;
    }

}
