package com.hospitalGroup.hospitalProject.services;

import com.hospitalGroup.hospitalProject.entityTables.doctor;
import com.hospitalGroup.hospitalProject.repository.doctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class doctorServices {
    @Autowired
    private doctorRepository doctorRepository;//connect service to repository

    public doctor InsertDoctor(doctor doc){
        return doctorRepository.save(doc);
    }
    public List<doctor> GetAllDoctors() {
        return doctorRepository.findAll();
    }

    public doctor UpdateDoctor(long dId, doctor updateob) {
        doctor fetch= doctorRepository.findById(dId).orElse(null);
        fetch.setDName(updateob.getDName());
        fetch.setSpecialization(updateob.getSpecialization());
        return doctorRepository.save(fetch);
    }


    public doctor DeleteData(long dId)
    {
        doctor fetch=doctorRepository.findById(dId).orElse(null);
        if(fetch!=null){
            doctorRepository.delete(fetch);
        }
        return fetch;
    }
}
