package com.hospitalGroup.hospitalProject.controller;

import com.hospitalGroup.hospitalProject.entityTables.doctor;
import com.hospitalGroup.hospitalProject.services.doctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hospital/doctor")
public class doctorController {
    @Autowired
    private doctorServices doctorServices;//connect controller to services

    @GetMapping("/fetch")
    public ResponseEntity<List<doctor>> GetAllDoctors(){
        return ResponseEntity.ok(doctorServices.GetAllDoctors());
    }

    @PostMapping
    public ResponseEntity<doctor> InsertDoctor(@RequestBody doctor doc){
        return ResponseEntity.ok(doctorServices.InsertDoctor(doc));
    }
    @PutMapping("{id}")
    public ResponseEntity<doctor> UpdateDoctor(@PathVariable long dId,@RequestBody doctor updateob){
        return ResponseEntity.ok(doctorServices.UpdateDoctor(dId, updateob));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<doctor> DeleteData(@PathVariable long dId){
        return ResponseEntity.ok(doctorServices.DeleteData(dId));
    }

}
