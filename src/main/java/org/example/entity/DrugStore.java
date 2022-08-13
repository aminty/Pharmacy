package org.example.entity;

import java.util.List;

public class DrugStore {

     private  List<Employee> employees;

    private List<Drug>  drugs;

    private double  totalCash;

    public DrugStore() {
    }

    public DrugStore(List<Employee> employees, List<Drug> drugs, double totalCash) {
        this.employees = employees;
        this.drugs = drugs;
        this.totalCash = totalCash;
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    @Override
    public String toString() {
        return "DrugStore{" +
                "employees=" + employees +
                ", drugs=" + drugs +
                ", totalCash=" + totalCash +
                '}';
    }
}
