package org.example.entity;

import org.example.base.entity.Person;

import java.util.List;

public class Patient extends Person {

    private List<Doctor> doctors;
    private String selfExpression;
    private List<Prescription> prescriptions;
    private double totalPayed;
    private double amount;

    private boolean isAccepted;

    public Patient() {
    }

    public Patient(List<Doctor> doctors, String selfExpression, List<Prescription> prescriptions, double totalPayed, double amount, boolean isAccepted) {
        this.doctors = doctors;
        this.selfExpression = selfExpression;
        this.prescriptions = prescriptions;
        this.totalPayed = totalPayed;
        this.amount = amount;
        this.isAccepted = isAccepted;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public String getSelfExpression() {
        return selfExpression;
    }

    public void setSelfExpression(String selfExpression) {
        this.selfExpression = selfExpression;
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

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctors=" + doctors +
                ", selfExpression='" + selfExpression + '\'' +
                ", prescriptions=" + prescriptions +
                ", totalPayed=" + totalPayed +
                ", amount=" + amount +
                ", isAccepted=" + isAccepted +
                '}';
    }
}
