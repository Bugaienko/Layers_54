package repository;

import model.Car;
import utils.MyArrayList;
import utils.MyList;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.01.2025
 */

public class CarRepositoryImpl implements CarRepository {

    // Все машины будут хранится в памяти нашего приложения
    private final MyList<Car> cars;


    // Объект, отвечающий за генерацию уникальных id
    private final AtomicInteger currentId = new AtomicInteger(1);

    public CarRepositoryImpl() {
        this.cars = new MyArrayList<>();
        addStartCars();
    }

    private void addStartCars() {
        cars.addAll(
                new Car(currentId.getAndIncrement(), "VW Golf", 2021, 20000.00),
                new Car(currentId.getAndIncrement(), "VW Golf", 2019, 17500),
                new Car(currentId.getAndIncrement(), "VW Passat", 2022, 30000.00),
                new Car(currentId.getAndIncrement(), "VW Passat", 2020, 24300.00),
                new Car(currentId.getAndIncrement(), "VW Tiguan", 2023, 35000.00)
        );
    }

    @Override
    public Car addCar(String model, int year, double price) {
        Car car = new Car(currentId.getAndIncrement(), model, year, price);
        cars.add(car);
        return car;
    }

    @Override
    public MyList<Car> getAllCars() {
        return cars;
    }

    @Override
    public Car getById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) return car;
        }
        return null;
    }

    @Override
    public MyList<Car> getCarsByModel(String model) {
        MyList<Car> result = new MyArrayList<>();
        // Перебрать каждую машину. Проверить, если модель совпала -> добавить машину в список result
        return result;
    }

    @Override
    public void updatePrice(int id, double newPrice) {
        // Todo
    }

    @Override
    public void updateCarStatus(int id, boolean newStatus) {
        // Todo
    }

    @Override
    public void deleteById(int id) {
        // Todo
    }
}
