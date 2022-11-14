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

package org.oliot.heroku.tsd.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

public class ProductDataValidationEventHandler implements ValidationEventHandler {

    private static final Logger logger = LoggerFactory
            .getLogger(ProductDataValidationEventHandler.class);

    @Override
    public boolean handleEvent(ValidationEvent event) {
        logger.warn("=========== VALIDATION FAILED; ABORTING ===========");
        logger.warn("Severity: " + event.getSeverity());
        logger.warn("Message: " + event.getMessage());
        logger.warn("Linked Exception: " + event.getLinkedException());
        logger.warn("Locator:");
        logger.warn("    Line Number: " + event.getLocator().getLineNumber());
        logger.warn("    Column Number: " + event.getLocator().getColumnNumber());
        logger.warn("    Offset: " + event.getLocator().getOffset());
        logger.warn("    Object: " + event.getLocator().getObject());
        logger.warn("    Node: " + event.getLocator().getNode());
        logger.warn("    URL: " + event.getLocator().getURL());
        return false;
    }
}
