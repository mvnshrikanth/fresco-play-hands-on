package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals() {
        List<Hospital> hospitalList = new ArrayList<Hospital>();
        this.hospitalRepository.findAll().forEach(hospitalList::add);
        return hospitalList;
    }

}

