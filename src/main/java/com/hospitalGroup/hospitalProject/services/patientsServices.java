package com.hospitalGroup.hospitalProject.services;

import com.hospitalGroup.hospitalProject.entityTables.patients;
import com.hospitalGroup.hospitalProject.repository.patientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class patientsServices {

    @Autowired
    public patientsRepository patientsRepository;

    public List<patients> GetAllPatients() {
        return patientsRepository.findAll();
    }

    public patients InsertPatients(patients patients) {
        return patientsRepository.save(patients);
    }

    public patients UpdatePatients(long pId, patients patients1) {
        patients f=patientsRepository.findById(pId).orElse(null);
        f.setPName(patients1.getPName());
        f.setAge(patients1.getAge());
        return patientsRepository.save(f);
    }

    public patients DeletePatients(long pId) {
        patients ft=patientsRepository.findById(pId).orElse(null);
        if(ft!=null){
            patientsRepository.delete(ft);
        }
        return ft;
    }
}
