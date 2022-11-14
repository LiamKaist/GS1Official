
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
import java.math.BigInteger;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="documentStatusCode" type="{urn:gs1:shared:shared_common:xsd:3}DocumentStatusEnumerationType"/>
 *         &lt;element name="documentActionCode" type="{urn:gs1:shared:shared_common:xsd:3}DocumentActionEnumerationType" minOccurs="0"/>
 *         &lt;element name="documentStructureVersion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:gs1:shared:shared_common:xsd:3}ExtensionType" minOccurs="0"/>
 *         &lt;element name="documentEffectiveDate" type="{urn:gs1:shared:shared_common:xsd:3}DateOptionalTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "creationDateTime",
    "documentStatusCode",
    "documentActionCode",
    "documentStructureVersion",
    "lastUpdateDateTime",
    "revisionNumber",
    "extension",
    "documentEffectiveDate"
})
public abstract class DocumentType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DocumentStatusEnumerationType documentStatusCode;
    @XmlSchemaType(name = "string")
    protected DocumentActionEnumerationType documentActionCode;
    protected String documentStructureVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDateTime;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger revisionNumber;
    protected ExtensionType extension;
    protected DateOptionalTimeType documentEffectiveDate;

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the documentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusEnumerationType }
     *     
     */
    public DocumentStatusEnumerationType getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * Sets the value of the documentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusEnumerationType }
     *     
     */
    public void setDocumentStatusCode(DocumentStatusEnumerationType value) {
        this.documentStatusCode = value;
    }

    /**
     * Gets the value of the documentActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentActionEnumerationType }
     *     
     */
    public DocumentActionEnumerationType getDocumentActionCode() {
        return documentActionCode;
    }

    /**
     * Sets the value of the documentActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentActionEnumerationType }
     *     
     */
    public void setDocumentActionCode(DocumentActionEnumerationType value) {
        this.documentActionCode = value;
    }

    /**
     * Gets the value of the documentStructureVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStructureVersion() {
        return documentStructureVersion;
    }

    /**
     * Sets the value of the documentStructureVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStructureVersion(String value) {
        this.documentStructureVersion = value;
    }

    /**
     * Gets the value of the lastUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Sets the value of the lastUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDateTime(XMLGregorianCalendar value) {
        this.lastUpdateDateTime = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRevisionNumber(BigInteger value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the documentEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public DateOptionalTimeType getDocumentEffectiveDate() {
        return documentEffectiveDate;
    }

    /**
     * Sets the value of the documentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public void setDocumentEffectiveDate(DateOptionalTimeType value) {
        this.documentEffectiveDate = value;
    }

}
