package de.telran.appforcars.controller;

import de.telran.appforcars.service.CarService;
import de.telran.appforcars.entity.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping(value = "/car/{id}")
    public Car getCarById(@PathVariable(value = "id") Integer id) {
        Car car = carService.getById(id);
        return car;
    }

    @PostMapping(value = "/car")
    public void saveCar(@RequestBody Car car) {
        carService.save(car);
    }

    @DeleteMapping(value = "/car/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        carService.deleteById(id);
    }

    @PutMapping(value = "/car/{id}")
    public void updateCarById(@PathVariable(value = "id") Integer id, @RequestBody Car car) {
        carService.update(id, car);
    }

}
