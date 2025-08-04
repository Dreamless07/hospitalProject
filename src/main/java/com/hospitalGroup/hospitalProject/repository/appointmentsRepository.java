package com.hospitalGroup.hospitalProject.repository;

import com.hospitalGroup.hospitalProject.entityTables.appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface appointmentsRepository extends JpaRepository<appointments, Long> {
}
