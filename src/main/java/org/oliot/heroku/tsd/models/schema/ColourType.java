
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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ColourType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColourType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colourCode" type="{urn:gs1:shared:shared_common:xsd:3}ColourCodeType" minOccurs="0"/>
 *         &lt;element name="colourDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColourType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "colourCode",
    "colourDescription"
})
public class ColourType {

    protected ColourCodeType colourCode;
    protected List<Description80Type> colourDescription;

    /**
     * Gets the value of the colourCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColourCodeType }
     *     
     */
    public ColourCodeType getColourCode() {
        return colourCode;
    }

    /**
     * Sets the value of the colourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourCodeType }
     *     
     */
    public void setColourCode(ColourCodeType value) {
        this.colourCode = value;
    }

    /**
     * Gets the value of the colourDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colourDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColourDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getColourDescription() {
        if (colourDescription == null) {
            colourDescription = new ArrayList<Description80Type>();
        }
        return this.colourDescription;
    }

}
