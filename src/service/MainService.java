package service;

import model.Car;
import model.User;
import utils.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.12.2024
 */

public interface MainService {

    User registerUser(String email, String password);

    boolean loginUser(String email, String password);

    void logout();

    boolean takeCar(int carId);

    void addCar(String model, int year, double price);

    MyList<Car> getAllCars();

    // Получить список машин по модели
    MyList<Car> getCarsByModel(String model);

    // Получить список свободных машин
    MyList<Car> getFreeCars();

    // Delete
    Car deleteCarById(int id);

}
