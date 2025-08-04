package com.hospitalGroup.hospitalProject.repository;

import com.hospitalGroup.hospitalProject.entityTables.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepository extends JpaRepository<doctor, Long> {
}
