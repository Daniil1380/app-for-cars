package de.telran.appforcars.service;

import de.telran.appforcars.entity.Car;

public interface CarService {

    Car getById(Integer id);

    void save(Car car);

    void deleteById(Integer id);

    void update(Integer id, Car car);

}
