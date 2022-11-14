
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


/**
 * <p>Java class for EntityIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityIdentification">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contentOwner" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityIdentificationType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "entityIdentification",
    "contentOwner"
})
@XmlSeeAlso({
    TypedEntityIdentificationType.class,
    DocumentReferenceType.class
})
public class EntityIdentificationType {

    @XmlElement(required = true)
    protected String entityIdentification;
    protected PartyIdentificationType contentOwner;

    /**
     * Gets the value of the entityIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityIdentification() {
        return entityIdentification;
    }

    /**
     * Sets the value of the entityIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityIdentification(String value) {
        this.entityIdentification = value;
    }

    /**
     * Gets the value of the contentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationType }
     *     
     */
    public PartyIdentificationType getContentOwner() {
        return contentOwner;
    }

    /**
     * Sets the value of the contentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationType }
     *     
     */
    public void setContentOwner(PartyIdentificationType value) {
        this.contentOwner = value;
    }

}
