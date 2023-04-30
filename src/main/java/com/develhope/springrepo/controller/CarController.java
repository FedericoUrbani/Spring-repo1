package com.develhope.springrepo.controller;

import com.develhope.springrepo.entity.Car;
import com.develhope.springrepo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping
    public Car create(@RequestBody Car car) {
        Car carsaved = carRepository.saveAndFlush(car);
        return carsaved;
    }

    @GetMapping
    public List<Car> findAllCar() {
        return carRepository.findAll();
    }

  /*  @GetMapping("/pages")
    public Page<Car> getCarPages(@RequestParam(required = false) Optional<Integer> page,
                                 @RequestParam(required = false) Optional<Integer> size) {
        if (page.isPresent() && size.isPresent()) {
            Pageable pageable = PageRequest.of(page.get(), size.get());
            Page<Car> cars = carRepository.findAll(pageable);
            return cars;
        } else {
            Page<Car> pageCars = Page.empty();
            return pageCars;
        }
    } */
}
