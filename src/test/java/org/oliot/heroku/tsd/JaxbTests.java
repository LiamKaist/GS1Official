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

package org.oliot.heroku.tsd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.oliot.heroku.tsd.models.schema.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JaxbTests {

    @Test
    public void testProductData() throws SAXException, JAXBException {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        File schemaFile = new File("src/main/java/org/oliot/heroku/tsd/models/schema/tsd/ProductData.xsd");
        Schema schema = schemaFactory.newSchema(schemaFile);

        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setSchema(schema);

        File xml = new File("src/test/resources/xmls/ProductData/ProductData_1.xml");

        JAXBElement<TSDProductDataType> jaxbElement
                = (JAXBElement<TSDProductDataType>) unmarshaller.unmarshal(xml);
        TSDProductDataType tsdProductDataType
                = jaxbElement.getValue();
        System.out.println(tsdProductDataType.getEpcURI());
        ExtensionType obj = tsdProductDataType.getProductDataRecord().get(0).getModule().get(0);
        for (Object o: obj.getAny()) {
            JAXBElement elem = (JAXBElement)o;
            switch (elem.getName().getLocalPart()) {
                case "basicProductInformationModule":
                    TSDBasicProductInformationModuleType basicProductInformationModuleType =
                            (TSDBasicProductInformationModuleType) elem.getValue();
                    System.out.println(basicProductInformationModuleType.getProductName().get(0).getValue());
                    break;
                case "productAllergenInformationModule":
                    TSDProductAllergenInformationModuleType productAllergenInformationModuleType =
                            (TSDProductAllergenInformationModuleType) elem.getValue();
                    System.out.println(productAllergenInformationModuleType.getAllergenRelatedInformation().get(0).getAllergenSpecificationAgency());
            }
        }
    }

    @Test
    public void testBasicProductInformationModule() throws SAXException, JAXBException {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        File schemaFile = new File("src/main/java/org/oliot/heroku/tsd/models/schema/tsd/BasicProductInformationModule.xsd");
        Schema schema = schemaFactory.newSchema(schemaFile);

        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setSchema(schema);

        File xml = new File("src/test/resources/xmls/modules/BasicProductInformationModule/BasicProductInformationModule_1.xml");

        JAXBElement<TSDBasicProductInformationModuleType> jaxbElement
                = (JAXBElement<TSDBasicProductInformationModuleType>) unmarshaller.unmarshal(xml);
        TSDBasicProductInformationModuleType tsdBasicProductInformationModuleType
                = jaxbElement.getValue();
        assertEquals("", "Consumer Market Description", tsdBasicProductInformationModuleType.getConsumerMarketingDescription().get(0).getValue());
        assertEquals("", "Product Name", tsdBasicProductInformationModuleType.getProductName().get(0).getValue());
        assertEquals("", "12345678", tsdBasicProductInformationModuleType.getGpcCategoryCode());
    }

}
