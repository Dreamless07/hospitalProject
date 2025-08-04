package com.hospitalGroup.hospitalProject.repository;

import com.hospitalGroup.hospitalProject.entityTables.patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientsRepository extends JpaRepository<patients, Long> {
}
