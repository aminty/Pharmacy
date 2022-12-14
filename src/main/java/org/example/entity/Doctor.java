package org.example.entity;

import org.example.base.entity.BaseEntity;
import org.example.base.entity.Person;

import java.util.List;

public class Doctor extends Person {
    private String username;
    private String password;
    private MedicalField medicalField;

    private List<Patient> patientList;

    private double income;

    public Doctor() {
    }

    public Doctor(String username, String password, MedicalField medicalField, List<Patient> patientList, double income) {
        this.username = username;
        this.password = password;
        this.medicalField = medicalField;
        this.patientList = patientList;
        this.income = income;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MedicalField getMedicalField() {
        return medicalField;
    }

    public void setMedicalField(MedicalField medicalField) {
        this.medicalField = medicalField;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", medicalField=" + medicalField +
                ", patientList=" + patientList +
                ", income=" + income +
                '}';
    }
}
