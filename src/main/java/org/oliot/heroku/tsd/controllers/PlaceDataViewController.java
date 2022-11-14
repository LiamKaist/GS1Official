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

package org.oliot.heroku.tsd.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import org.apache.commons.lang3.StringUtils;
import org.oliot.heroku.tsd.exceptions.ResourceNotFoundException;
import org.oliot.heroku.tsd.models.ProductDataRepository;
import org.oliot.heroku.tsd.models.schema.TSDBasicProductInformationModuleType;
import org.oliot.heroku.tsd.models.schema.TSDImageLinkType;
import org.oliot.heroku.tsd.models.schema.TSDProductDataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.xml.bind.JAXBElement;
import java.util.List;
import java.util.Random;


@Controller
public class PlaceDataViewController {
    private ProductDataRepository repository;
    private static final Logger logger = LoggerFactory
            .getLogger(PlaceDataViewController.class);

    @Autowired
    public PlaceDataViewController(ProductDataRepository repository) {
        this.repository = repository;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public String handleResourceNotFoundException(Model model) {
        model.addAttribute("errorMessage", "Place not found in database!");
        return "404";
    }

    @GetMapping("/place/{gln}")
    public String consumerView(@PathVariable String gln, Model model) {
        TSDProductDataType tsdProductDataType;
        List<JAXBElement> iterator;

        String gln14 = StringUtils.leftPad(gln, 14, "0");
        logger.info("Requested GLN: " + gln14);

        tsdProductDataType = repository.getProductHeader(gln14);
        iterator = repository.getModuleInformation(TSDBasicProductInformationModuleType.class, gln14);
        if (tsdProductDataType != null) {
            String productName;
            int i = 0;
            for (JAXBElement element : iterator) {
                TSDImageLinkType imageLink;
                Random rand = new Random();

                TSDBasicProductInformationModuleType basicProductInformationModuleType = (TSDBasicProductInformationModuleType)
                        element.getValue();
                productName = basicProductInformationModuleType.getProductName().get(0).getValue();
                imageLink = basicProductInformationModuleType.getImageLink().get(rand.nextInt(
                        basicProductInformationModuleType.getImageLink().size()));

                model.addAttribute("productName_" + i, productName);
                logger.info("Product Name: " + productName);
                model.addAttribute("imageLink_" + i, imageLink.getUrl());
                logger.info("Image URL: " + imageLink.getUrl());

                i++;
            }
            model.addAttribute("productData", tsdProductDataType);

            return "place/index";
        } else {
            throw new ResourceNotFoundException();
        }
    }
}
