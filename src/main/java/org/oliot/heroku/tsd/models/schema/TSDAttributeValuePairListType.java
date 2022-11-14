
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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TSD_AttributeValuePairListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_AttributeValuePairListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stringAVP" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_StringAttributeValuePairType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_AttributeValuePairListType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "stringAVP"
})
public class TSDAttributeValuePairListType {

    @XmlElement(required = true)
    protected List<TSDStringAttributeValuePairType> stringAVP;

    /**
     * Gets the value of the stringAVP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringAVP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringAVP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDStringAttributeValuePairType }
     * 
     * 
     */
    public List<TSDStringAttributeValuePairType> getStringAVP() {
        if (stringAVP == null) {
            stringAVP = new ArrayList<TSDStringAttributeValuePairType>();
        }
        return this.stringAVP;
    }

}
