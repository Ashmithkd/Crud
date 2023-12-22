package com.crudApplication.crud.mobile.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mobile")
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "brand")
    String brand;
    @Column(name = "model")
    String model;
    @Column(name = "ram")
    int ram;
    @Column(name = "storage")
    int storage;

    public Mobile(String brand, String model, int ram, int storage) {
        this.ram=ram;
        this.brand=brand;
        this.model=model;
        this.storage=storage;
    }
    public Mobile(){
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
