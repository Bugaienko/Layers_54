package service;

import model.Car;
import model.User;
import repository.CarRepository;
import repository.UserRepository;
import utils.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.01.2025
 */

public class MainServiceImpl implements MainService {

    private final CarRepository carRepository;
    private final UserRepository userRepository;
    private User activeUser;

    public MainServiceImpl(CarRepository carRepository, UserRepository userRepository) {
        this.carRepository = carRepository;
        this.userRepository = userRepository;
    }


    @Override
    public User registerUser(String email, String password) {
        return null;
    }

    @Override
    public boolean loginUser(String email, String password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean takeCar(int carId) {
        return false;
    }

    @Override
    public void addCar(String model, int year, double price) {

    }

    @Override
    public MyList<Car> getAllCars() {
        return null;
    }

    @Override
    public MyList<Car> getCarsByModel(String model) {
        return null;
    }

    @Override
    public MyList<Car> getFreeCars() {
        return null;
    }

    @Override
    public Car deleteCarById(int id) {
        return null;
    }
}
