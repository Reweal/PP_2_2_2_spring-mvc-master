package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao cars;

    @Autowired
    CarServiceImpl(CarDao cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.getCarsList(count);
    }
}
