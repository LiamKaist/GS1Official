
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
 * <p>Java class for TSD_ExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_ExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exceptionReason" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ExceptionType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "exceptionReason"
})
public class TSDExceptionType {

    @XmlElement(required = true)
    protected Description200Type exceptionReason;

    /**
     * Gets the value of the exceptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getExceptionReason() {
        return exceptionReason;
    }

    /**
     * Sets the value of the exceptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setExceptionReason(Description200Type value) {
        this.exceptionReason = value;
    }

}
