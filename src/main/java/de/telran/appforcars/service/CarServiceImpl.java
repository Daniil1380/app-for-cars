package de.telran.appforcars.service;

import de.telran.appforcars.entity.Car;
import de.telran.appforcars.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public Car getById(Integer id) {
        Optional<Car> optional = carRepository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteById(Integer id) {
        carRepository.deleteById(id);
    }

    @Override
    public void update(Integer id, Car car) {
        Optional<Car> persistCarOptional = carRepository.findById(id);

        if (persistCarOptional.isPresent()) {
            Car persistCar = persistCarOptional.get();
            persistCar.setName(car.getName());
            carRepository.save(persistCar);
        }

    }

}
