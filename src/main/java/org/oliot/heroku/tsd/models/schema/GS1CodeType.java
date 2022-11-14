
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
 * <p>Java class for GS1CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:gs1:shared:shared_common:xsd:3>String80Type">
 *       &lt;attribute name="codeListVersion">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="35"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1CodeType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "value"
})
@XmlSeeAlso({
    FinancialAccountNumberTypeCodeType.class,
    AdditionalTradeItemIdentificationTypeCodeType.class,
    IncotermsCodeType.class,
    AdditionalReturnableAssetIdentificationTypeCodeType.class,
    AdditionalShipmentIdentificationTypeCodeType.class,
    PaymentMethodCodeType.class,
    MeasurementUnitCodeType.class,
    FinancialRoutingNumberTypeCodeType.class,
    CommunicationChannelCodeType.class,
    AllowanceChargeTypeCodeType.class,
    TemperatureMeasurementUnitCodeType.class,
    AdditionalPartyIdentificationTypeCodeType.class,
    NutrientTypeCodeType.class,
    TimeMeasurementUnitCodeType.class,
    AdditionalIndividualAssetIdentificationTypeCodeType.class,
    AdditionalConsignmentIdentificationTypeCodeType.class,
    TaxCategoryCodeType.class,
    CountrySubdivisionCodeType.class,
    ContactTypeCodeType.class,
    LanguageCodeType.class,
    PaymentTermsTypeCodeType.class,
    AdditionalServiceRelationIdentificationTypeCodeType.class,
    EntityTypeCodeType.class,
    AdditionalLogisticUnitIdentificationTypeCodeType.class,
    CountryCodeType.class,
    CurrencyCodeType.class,
    BarCodeTypeCodeType.class,
    PartyRoleCodeType.class,
    DateFormatCodeType.class,
    TSDMeasurementPrecisionCodeType.class,
    TSDProductInformationTypeCodeType.class,
    TSDImageTypeCodeType.class,
    TSDPartyContactRoleCodeType.class,
    TSDPreparationTypeCodeType.class,
    TSDNutrientTypeCodeType.class,
    TSDPreparationStateCodeType.class,
    TSDAllergenTypeCodeType.class,
    TSDLevelOfContainmentCodeType.class,
    TSDDietaryClaimCodeType.class,
    TSDRegulatoryComplianceCodeType.class,
    TSDNutritionalClaimCodeType.class,
    TSDAccreditationCodeType.class,
    TSDProductActivityTypeCodeType.class
})
public class GS1CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the codeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * Sets the value of the codeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

}
