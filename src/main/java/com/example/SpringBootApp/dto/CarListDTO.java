package com.example.SpringBootApp.dto;

import com.example.SpringBootApp.domain.Car;

import java.util.List;

/**
 * El objetivo de esta clase es devolver datos al fronted(cliente)
 * no tienen ninguna complejidad
 */
public class CarListDTO {
    private List<Car> cars;

    public CarListDTO() {}

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
