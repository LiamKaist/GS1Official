package org.oliot.heroku.tsd.models.schema;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_LiamTestModuleType", namespace = "urn:gs1:tsd:product_data:xsd:1", propOrder = {
    "productName",
})

public class TSDLiamTestModuleType {

    @Id
    @XmlTransient
    private final String id = null;  //Seems like these 3 lines are always there independently from the type that's being described
//By calling the packages from schema, we are able to reuse some classes defined elsewhere as types like CountryCodeType
    @XmlElement(required = true)
    protected Description80Type productName;


    /**
     * Gets the value of the productName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductName(String value) {
        this.productName = value;
    }
    
}

