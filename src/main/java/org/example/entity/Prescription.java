package org.example.entity;

import jdk.jshell.Snippet;
import org.example.base.entity.BaseEntity;

import java.util.List;

public class Prescription extends BaseEntity<Long> {
    private Doctor doctor;
    private Patient prescriptionOwner;
    private List<Drug> drugs;
    private PrescriptionStatus status;

    public Prescription() {
    }

    public Prescription(Doctor doctor, Patient prescriptionOwner, List<Drug> drugs, PrescriptionStatus status) {
        this.doctor = doctor;
        this.prescriptionOwner = prescriptionOwner;
        this.drugs = drugs;
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPrescriptionOwner() {
        return prescriptionOwner;
    }

    public void setPrescriptionOwner(Patient prescriptionOwner) {
        this.prescriptionOwner = prescriptionOwner;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public PrescriptionStatus getStatus() {
        return status;
    }

    public void setStatus(PrescriptionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "doctor=" + doctor +
                ", prescriptionOwner=" + prescriptionOwner +
                ", drugs=" + drugs +
                ", status=" + status +
                '}';
    }
}
