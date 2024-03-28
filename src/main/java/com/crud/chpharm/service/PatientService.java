package com.crud.chpharm.service;

import com.crud.chpharm.model.Patient;
import com.crud.chpharm.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }


    public Patient updatePatient(Long id, Patient patientDetails) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));

        patient.setSampleId(patientDetails.getSampleId());
        patient.setPatientId(patientDetails.getPatientId());
        patient.setName(patientDetails.getName());
        patient.setGender(patientDetails.getGender());

        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));

        patientRepository.delete(patient);
    }



}
