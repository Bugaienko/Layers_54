package repository;

import model.Car;
import utils.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.01.2025
 */

public class CarRepositoryImpl implements CarRepository {


    @Override
    public Car addCar(String model, int year, double price) {
        return null;
    }

    @Override
    public MyList<Car> getAllCars() {
        return null;
    }

    @Override
    public Car getById(int id) {
        return null;
    }

    @Override
    public MyList<Car> getCarsByModel(String model) {
        return null;
    }

    @Override
    public void updatePrice(int id, double newPrice) {

    }

    @Override
    public void updateCarStatus(int id, boolean newStatus) {

    }

    @Override
    public void deleteById(int id) {

    }
}
