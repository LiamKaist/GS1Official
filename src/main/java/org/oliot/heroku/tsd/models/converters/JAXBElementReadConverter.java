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

import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.LinkedHashMap;
import java.util.List;

@Component
@ReadingConverter
public class JAXBElementReadConverter implements Converter<DBObject, JAXBElement> {
    private final MongoConverter converter;

    public JAXBElementReadConverter(MongoConverter converter) {
        this.converter = converter;
    }

    @Override
    public JAXBElement convert(DBObject dbObject) {
        Class declaredType, scope;
        QName name = qNameFromString((String)dbObject.get("name"));
        Object rawValue = dbObject.get("value");
        try {
            declaredType = Class.forName((String)dbObject.get("declaredType"));
        } catch (ClassNotFoundException e) {
            if (rawValue.getClass().isArray()) declaredType = List.class;
            else declaredType = LinkedHashMap.class;
        }
        try {
            scope = Class.forName((String) dbObject.get("scope"));
        } catch (ClassNotFoundException e) {
            scope = JAXBElement.GlobalScope.class;
        }
        Object value = rawValue instanceof DBObject ? converter.read(declaredType, (DBObject) rawValue) : rawValue;
        return new JAXBElement(name, declaredType, scope, value);
    }

    QName qNameFromString(String s) {
        String[] parts = s.split("[{}]");
        if (parts.length > 2) return new QName(parts[1], parts[2], parts[0]);
        if (parts.length == 1) return new QName(parts[0]);
        return new QName("undef");
    }
}
