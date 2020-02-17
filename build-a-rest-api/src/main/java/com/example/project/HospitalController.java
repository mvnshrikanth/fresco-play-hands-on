package com.example.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test/")
public class HospitalController {

    Logger logger = LoggerFactory.getLogger(HospitalController.class);

    @Autowired
    private HospitalService hospitalService;

    @RequestMapping(value = "/hospitals/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Hospital getHospital(@PathVariable("id") int id) throws Exception {
        Hospital hospital = this.hospitalService.getHospital(id);
        return hospital;
    }

    @RequestMapping(value = "/hospitals", method = RequestMethod.GET)
    public @ResponseBody
    List<Hospital> getAllHospitals() throws Exception {
        logger.info("This was called");
        return this.hospitalService.getAllHospitals();
    }
}
