package org.oliot.heroku.tsd.controllers;

import org.oliot.heroku.tsd.models.ProductDataRepository;
import org.oliot.heroku.tsd.models.schema.TSDBasicProductInformationModuleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBElement;
import java.util.List;

@RestController
public class PlaceDataRestController {
    private ProductDataRepository repository;

    @Autowired
    public PlaceDataRestController(ProductDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/place/{gln}/BasicProductInformation")
    public TSDBasicProductInformationModuleType getBasicProductInformation(@PathVariable String gln) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDBasicProductInformationModuleType.class, gln);
        return iterator.isEmpty() ? null : (TSDBasicProductInformationModuleType) iterator.get(0).getValue();
    }
}
