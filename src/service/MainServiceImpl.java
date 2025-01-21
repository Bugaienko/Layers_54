package service;

import model.Car;
import model.User;
import repository.CarRepository;
import repository.UserRepository;
import utils.MyList;
import utils.PersonValidation;

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
        /*
        1. Валидация email / password
        2. Проверить уникальность email (что у нас нет пользователя с таким email)
        3. Создаю нового пользователя, и сохраняю в БД
        4. Возвращаю пользователя в слой view

         */
        if (!PersonValidation.isEmailValid(email)) {
            System.out.print("Email не прошел проверку!");
            return null;
        }

        if (!PersonValidation.isPasswordValid(password)) {
            System.out.println("Password не прошел проверку!");
            return null;
        }

        if (userRepository.isEmailExist(email)) {
            System.out.println("Email already exists!");
            return null;
        }

        User user = userRepository.addUser(email, password);

        return user;

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
