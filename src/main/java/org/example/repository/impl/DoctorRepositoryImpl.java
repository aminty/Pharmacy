package org.example.repository.impl;

import org.example.entity.Doctor;
import org.example.entity.Patient;
import org.example.repository.DoctorRepository;

import java.util.List;

public class DoctorRepositoryImpl implements DoctorRepository {
    @Override
    public void createTable() {
        String sql="create table Doctor if not exist ";

    }
    @Override
    public Doctor findById(Long aLong) {
        return null;
    }

    @Override
    public Doctor save(Doctor doctor) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<Doctor> findAll() {
        return null;
    }

    @Override
    public Doctor update(Doctor doctor) {
        return null;
    }



    @Override
    public List<Patient> getAllPatientByDrId(long id) {
        return null;
    }

    @Override
    public double getAllIncomeById(long id) {
        return 0;
    }
}
