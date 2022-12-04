package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("Nissan", "Blue", 180));
        listCar.add(new Car("Lada", "Black", 260));
        listCar.add(new Car("Mitsubishi", "Yellow", 220));
        listCar.add(new Car("Kia", "Red", 210));
        listCar.add(new Car("Renault", "Grey", 195));
    }


    @Override
    public List<Car> getCars(int numb) {
        return listCar.stream().limit(numb).toList();
    }

    @Override
    public List<Car> getAllCars() {
        return listCar;
    }
}
