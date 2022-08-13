package org.example.entity;

import org.example.base.entity.Person;

import java.util.List;

public class Patient extends Person {

    private  List<Doctor> doctors;
    private  List<Prescription> prescriptions;
    private double totalPayed;
    private double amount;

    public Patient() {
    }

    public Patient(List<Doctor> doctors, List<Prescription> prescriptions, double totalPayed, double amount) {
        this.doctors = doctors;
        this.prescriptions = prescriptions;
        this.totalPayed = totalPayed;
        this.amount = amount;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public double getTotalPayed() {
        return totalPayed;
    }

    public void setTotalPayed(double totalPayed) {
        this.totalPayed = totalPayed;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctors=" + doctors +
                ", prescriptions=" + prescriptions +
                ", totalPayed=" + totalPayed +
                ", amount=" + amount +
                '}';
    }
}
