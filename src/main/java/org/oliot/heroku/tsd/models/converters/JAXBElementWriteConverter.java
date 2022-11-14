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

package org.oliot.heroku.tsd.models.converters;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Component
@WritingConverter
public class JAXBElementWriteConverter implements Converter<JAXBElement, DBObject> {
    private final MongoConverter converter;

    public JAXBElementWriteConverter(MongoConverter converter) {
        this.converter = converter;
    }

    @Override
    public DBObject convert(JAXBElement jaxbElement) {
        DBObject dbObject = new BasicDBObject();
        dbObject.put("name", qNameToString(jaxbElement.getName()));
        dbObject.put("declaredType", jaxbElement.getDeclaredType().getName());
        dbObject.put("scope", jaxbElement.getScope().getCanonicalName());
        dbObject.put("value", converter.convertToMongoType(jaxbElement.getValue()));
        dbObject.put("_class", JAXBElement.class.getName());

        return dbObject;
    }

    public String qNameToString(QName name) {
        if (name.getNamespaceURI() == XMLConstants.NULL_NS_URI) return name.getLocalPart();
        return name.getPrefix() + '{' + name.getNamespaceURI() + '}' + name.getLocalPart();
    }
}
