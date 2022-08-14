package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Doctor;
import org.example.entity.Patient;
import org.example.entity.Prescription;

import java.util.List;

public interface DoctorRepository extends BaseRepository<Doctor,Long> {


    List<Patient> getAllPatientByDrId(long id);

    double getAllIncomeById(long id );





}
