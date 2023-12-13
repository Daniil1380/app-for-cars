package de.telran.appforcars;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

}