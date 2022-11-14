
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
 * <p>Java class for DimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/>
 *         &lt;element name="height" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/>
 *         &lt;element name="width" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "depth",
    "height",
    "width"
})
public class DimensionType {

    @XmlElement(required = true)
    protected MeasurementType depth;
    @XmlElement(required = true)
    protected MeasurementType height;
    @XmlElement(required = true)
    protected MeasurementType width;

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDepth(MeasurementType value) {
        this.depth = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setHeight(MeasurementType value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setWidth(MeasurementType value) {
        this.width = value;
    }

}
