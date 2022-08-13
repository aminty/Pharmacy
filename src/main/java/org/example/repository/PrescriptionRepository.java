package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Patient;
import org.example.entity.Prescription;

import java.util.List;

public interface PrescriptionRepository extends BaseRepository<Prescription,Long> {

    List<Prescription> findAllPrescriptionByPatientId(long id);


}
