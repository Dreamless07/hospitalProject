package com.hospitalGroup.hospitalProject.services;

import com.hospitalGroup.hospitalProject.entityTables.appointments;
import com.hospitalGroup.hospitalProject.repository.appointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class appointmentsServices {

    @Autowired
    public appointmentsRepository appointmentsRepository;

    public List<appointments> GetAllApppointments() {
        return appointmentsRepository.findAll();
    }

    public appointments InsertAppointments(appointments appointments) {
        return appointmentsRepository.save(appointments);
    }

    public appointments UpdateAppointments(long aId, appointments appointments) {
        appointments apfetch=appointmentsRepository.findById(aId).orElse(null);
        apfetch.setDoctor(apfetch.getDoctor());
        apfetch.setPatients(apfetch.getPatients());
        apfetch.setDate(apfetch.getDate());
        return appointmentsRepository.save(apfetch);
    }

    public appointments DeleteAppointments(long aId) {
        appointments apdel=appointmentsRepository.findById(aId).orElse(null);
        if(apdel!=null){
            appointmentsRepository.delete(apdel);
        }
        return apdel;
    }
}
