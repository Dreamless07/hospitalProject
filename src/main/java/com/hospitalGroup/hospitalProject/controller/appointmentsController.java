package com.hospitalGroup.hospitalProject.controller;

import com.hospitalGroup.hospitalProject.entityTables.appointments;
import com.hospitalGroup.hospitalProject.services.appointmentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hospital/appointments")
public class appointmentsController {
    @Autowired
    private appointmentsServices appointmentsServices;

    @GetMapping("/getappointments")
    public ResponseEntity<List<appointments>> GetAllAppointmnents(){
        return ResponseEntity.ok(appointmentsServices.GetAllApppointments());
    }
    @PostMapping
    public ResponseEntity<appointments> InsertAppointments(@RequestBody appointments appointments){
        return ResponseEntity.ok(appointmentsServices.InsertAppointments(appointments));
    }
    @PutMapping("{aId}")
    public ResponseEntity<appointments> UpdateAppointments(@PathVariable long aId, @RequestBody appointments appointments1){
        return ResponseEntity.ok(appointmentsServices.UpdateAppointments(aId, appointments1));
    }
    @DeleteMapping("{aId}")
    public ResponseEntity<appointments> DeleteAppointments(@PathVariable long aId){
        return ResponseEntity.ok(appointmentsServices.DeleteAppointments(aId));
    }

}
