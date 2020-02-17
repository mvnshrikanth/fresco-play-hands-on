package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @RequestMapping(path = "/hospitals", method = RequestMethod.GET)
    public @ResponseBody
    List<Hospital> getAllHospitals() {
        return this.hospitalService.getAllHospitals();
    }

}
