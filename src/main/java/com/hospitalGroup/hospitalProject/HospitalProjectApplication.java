package com.hospitalGroup.hospitalProject;

import com.hospitalGroup.hospitalProject.entityTables.appointments;
import com.hospitalGroup.hospitalProject.entityTables.doctor;
import com.hospitalGroup.hospitalProject.entityTables.patients;
import com.hospitalGroup.hospitalProject.repository.appointmentsRepository;
import com.hospitalGroup.hospitalProject.repository.doctorRepository;
import com.hospitalGroup.hospitalProject.repository.patientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(HospitalProjectApplication.class, args);}
		@Autowired
		private doctorRepository doctorRepository;
		@Autowired
		private patientsRepository patientsRepository;
		@Autowired
		private appointmentsRepository appointmentsRepository;
/*
	@Override
	public void run(String... args) throws Exception {
		doctor docob= new doctor();
		docob.setDName("Ajay");
		docob.setSpecialization("Cardiologist");
		doctorRepository.save(docob);

		patients pob=new patients();
		pob.setPName("Arun");
		pob.setAge(26);
		patientsRepository.save(pob);

		appointments aob=new appointments();
		aob.setDoctor(docob);
		aob.setPatients(pob);
		aob.setDate("08/04/2025");
		appointmentsRepository.save(aob);

	}

 */
}
