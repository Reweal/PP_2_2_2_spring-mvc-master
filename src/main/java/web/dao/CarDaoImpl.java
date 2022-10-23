package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("red", "LADA_CALINA", (short) 1999));
        cars.add(new Car("white", "LADA_GRANTA", (short) 2015));
        cars.add(new Car("purple", "LADA_PRIORA", (short) 2012));
        cars.add(new Car("gray", "LADA_VESTA", (short) 2021));
        cars.add(new Car("black", "AURUS", (short) 2022));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
