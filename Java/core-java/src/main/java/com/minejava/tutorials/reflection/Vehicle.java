package com.minejava.tutorials.reflection;

public class Vehicle {

    private String name;
    private Integer number;
    private String vehicleType;

    public Vehicle(String carName, Integer carNum, String vehType) {
        this.name = carName;
        this.number = carNum;
        this.vehicleType = vehType;
        privateVehileMethod();
    }

    public void setName(String carName) {
        this.name = carName;
    }

    public String getName() {
        return name;
    }

    public void setNumber(Integer carNumber) {
        this.number = carNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setVehicleType(String vehType) {
        this.name = vehType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void oundCarNoise(String name) {
        System.out.println("The vehicle " + name + " sounds: voomm voom");
    }

    private void privateVehileMethod() {
        System.out.println("This method is very private from vehicles..");
    }
}
