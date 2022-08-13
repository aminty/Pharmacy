package org.example.entity;

import org.example.base.entity.BaseEntity;
import org.example.base.entity.Person;

public class Doctor extends Person {
    private String username;
    private String password;
    private MedicalField medicalField;

    public Doctor() {
    }

    public Doctor(String username, String password, MedicalField medicalField) {
        this.username = username;
        this.password = password;
        this.medicalField = medicalField;
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

    @Override
    public String toString() {
        return "Doctor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", medicalField=" + medicalField +
                '}';
    }
}
