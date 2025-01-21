package model;

import java.util.Objects;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.12.2024
 */

public class Car {
    private final int id;
    private String model;
    private final int year;
    private double price;
    private boolean isBusy; // значение по умолчанию false

    public Car(int id, String model, int year, double price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isBusy=" + isBusy +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;

        return id == car.id && year == car.year && Double.compare(price, car.price) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(model);
        result = 31 * result + year;
        result = 31 * result + Double.hashCode(price);
        return result;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
}
