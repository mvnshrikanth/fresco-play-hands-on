package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    Logger logger = LoggerFactory.getLogger(HospitalService.class);

    private List<Hospital> hospitalList = new ArrayList<>(Arrays.asList(
            new Hospital(1001, "Apollo Hospital", "Chennai", 3.8),
            new Hospital(1002, "Global Hospital", "Chennai", 3.5),
            new Hospital(1003, "VCare Hospital", "Bangalore", 3)));

    public List<Hospital> getAllHospitals() {
        logger.info("Service class was called.");
//        List<Hospital> hospitalList = new ArrayList<Hospital>();
//        logger.info("Number of hospitals." + hospitalList.size());
        return this.hospitalList;
    }

    public Hospital getHospital(int id) {
        return hospitalList.stream().filter(c -> c.getId() == (id)).findFirst().get();
    }


}
