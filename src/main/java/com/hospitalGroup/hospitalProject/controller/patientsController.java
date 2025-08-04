package com.hospitalGroup.hospitalProject.controller;

import com.hospitalGroup.hospitalProject.entityTables.patients;
import com.hospitalGroup.hospitalProject.services.patientsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hospital/patients")
public class patientsController {
    @Autowired
    private patientsServices patientsServices;

    @GetMapping("/getpatients")
    public ResponseEntity<List<patients>> GetAllPatients(){
        return ResponseEntity.ok(patientsServices.GetAllPatients());
    }
    @PostMapping
    public ResponseEntity<patients> InsertPatients(@RequestBody patients patients){
        return ResponseEntity.ok(patientsServices.InsertPatients(patients));
    }
    @PutMapping("{pId}")
    public ResponseEntity<patients> UpdatePatients(@PathVariable long pId, @RequestBody patients patients1){
        return ResponseEntity.ok(patientsServices.UpdatePatients(pId, patients1));
    }
    @DeleteMapping("{pId}")
    public ResponseEntity<patients> DeletePatients(@PathVariable long pId){
        return ResponseEntity.ok(patientsServices.DeletePatients(pId));
    }
}
