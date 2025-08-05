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

    public appointments UpdateAppointments(long aId, appointments appointments1) {
        appointments apfetch=appointmentsRepository.findById(aId).orElse(null);
        apfetch.setDoctor(appointments1.getDoctor());
        apfetch.setPatients(appointments1.getPatients());
        apfetch.setDate(appointments1.getDate());
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
