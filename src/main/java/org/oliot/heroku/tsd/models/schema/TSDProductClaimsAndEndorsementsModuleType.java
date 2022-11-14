
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
 * <p>Java class for TSD_ProductClaimsAndEndorsementsModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductClaimsAndEndorsementsModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regulatoryComplianceCode" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_RegulatoryComplianceCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="warningStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutritionalClaimCode" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_NutritionalClaimCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutritionalClaimStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="healthClaimDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dietaryClaimCode" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_DietaryClaimCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accreditationInformation" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_AccreditationInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ProductClaimsAndEndorsementsModuleType", namespace = "urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1", propOrder = {
    "regulatoryComplianceCode",
    "warningStatement",
    "nutritionalClaimCode",
    "nutritionalClaimStatement",
    "healthClaimDescription",
    "dietaryClaimCode",
    "accreditationInformation",
    "avpList"
})
public class TSDProductClaimsAndEndorsementsModuleType {

    protected List<TSDRegulatoryComplianceCodeType> regulatoryComplianceCode;
    protected List<Description1000Type> warningStatement;
    protected List<TSDNutritionalClaimCodeType> nutritionalClaimCode;
    protected List<Description5000Type> nutritionalClaimStatement;
    protected List<Description1000Type> healthClaimDescription;
    protected List<TSDDietaryClaimCodeType> dietaryClaimCode;
    protected List<TSDAccreditationInformationType> accreditationInformation;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the regulatoryComplianceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryComplianceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryComplianceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDRegulatoryComplianceCodeType }
     * 
     * 
     */
    public List<TSDRegulatoryComplianceCodeType> getRegulatoryComplianceCode() {
        if (regulatoryComplianceCode == null) {
            regulatoryComplianceCode = new ArrayList<TSDRegulatoryComplianceCodeType>();
        }
        return this.regulatoryComplianceCode;
    }

    /**
     * Gets the value of the warningStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getWarningStatement() {
        if (warningStatement == null) {
            warningStatement = new ArrayList<Description1000Type>();
        }
        return this.warningStatement;
    }

    /**
     * Gets the value of the nutritionalClaimCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalClaimCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalClaimCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDNutritionalClaimCodeType }
     * 
     * 
     */
    public List<TSDNutritionalClaimCodeType> getNutritionalClaimCode() {
        if (nutritionalClaimCode == null) {
            nutritionalClaimCode = new ArrayList<TSDNutritionalClaimCodeType>();
        }
        return this.nutritionalClaimCode;
    }

    /**
     * Gets the value of the nutritionalClaimStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalClaimStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalClaimStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getNutritionalClaimStatement() {
        if (nutritionalClaimStatement == null) {
            nutritionalClaimStatement = new ArrayList<Description5000Type>();
        }
        return this.nutritionalClaimStatement;
    }

    /**
     * Gets the value of the healthClaimDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthClaimDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthClaimDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getHealthClaimDescription() {
        if (healthClaimDescription == null) {
            healthClaimDescription = new ArrayList<Description1000Type>();
        }
        return this.healthClaimDescription;
    }

    /**
     * Gets the value of the dietaryClaimCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dietaryClaimCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDietaryClaimCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDDietaryClaimCodeType }
     * 
     * 
     */
    public List<TSDDietaryClaimCodeType> getDietaryClaimCode() {
        if (dietaryClaimCode == null) {
            dietaryClaimCode = new ArrayList<TSDDietaryClaimCodeType>();
        }
        return this.dietaryClaimCode;
    }

    /**
     * Gets the value of the accreditationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accreditationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccreditationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDAccreditationInformationType }
     * 
     * 
     */
    public List<TSDAccreditationInformationType> getAccreditationInformation() {
        if (accreditationInformation == null) {
            accreditationInformation = new ArrayList<TSDAccreditationInformationType>();
        }
        return this.accreditationInformation;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public TSDAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public void setAvpList(TSDAttributeValuePairListType value) {
        this.avpList = value;
    }

}
