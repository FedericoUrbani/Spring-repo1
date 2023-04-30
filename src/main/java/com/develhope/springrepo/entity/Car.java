package com.develhope.springrepo.entity;

import jakarta.persistence.*;


@Entity
@Table
public class Car {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;


        @Column(nullable = false)
        private String modelName;


        @Column(nullable = false)
        private String serialNumber;

        @Column
        private double currentPrice;

        public Car(){

        }
        public Car(long id, String modelName,String serialNumber, double currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
        }


        public long getId() {
        return id;
        }

        public void setId(long id) {
        this.id = id;
        }

        public String getModelName() {
        return modelName;
        }

        public void setModelName(String modelName) {
        this.modelName = modelName;
        }

        public String getSerialNumber() {
        return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        }

        public double getCurrentPrice() {
        return currentPrice;
        }

        public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
        }
}

