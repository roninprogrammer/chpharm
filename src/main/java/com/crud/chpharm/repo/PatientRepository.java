package com.crud.chpharm.repo;

import com.crud.chpharm.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient, Long> {
}