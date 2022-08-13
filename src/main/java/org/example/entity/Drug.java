package org.example.entity;

import org.example.base.entity.BaseEntity;

public class Drug extends BaseEntity<Long> {

    private String name;

    private int count;

    private boolean isExists;

    private double price;

    public Drug() {
    }

    public Drug(String name, int count, boolean isExists, double price) {
        this.name = name;
        this.count = count;
        this.isExists = isExists;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isExists() {
        return isExists;
    }

    public void setExists(boolean exists) {
        isExists = exists;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", isExists=" + isExists +
                ", price=" + price +
                '}';
    }
}
