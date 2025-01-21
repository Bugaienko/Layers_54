package view;

import model.Car;
import model.User;
import service.MainService;
import utils.MyList;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.01.2025
 */

public class Menu {

    private final MainService service;
    private final Scanner scanner = new Scanner(System.in);


    public Menu(MainService service) {
        this.service = service;
    }

    public void start() {
        showMenu();
    }

    private void showMenu() {
        while (true) {
            System.out.println("Добро пожаловать в меню");
            System.out.println("1. Меню автомобилей");
            System.out.println("2. Меню пользователя");
            System.out.println("3. Меню администратора");
            System.out.println("0. Выход из системы");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("До свидания!");
                // Завершить работу приложения
                System.exit(0);
            }

            showSubMenu(choice);

        }
    }

    private void showSubMenu(int choice) {
        switch (choice) {
            case 1:
                // Todo show car menu
                break;
            case 2:
                // Todo show User Menu
                showUserMenu();
                break;
            case 3:
                // Todo show Admin Menu
                break;
            default:
                System.out.println("Сделайте корректный выбор");
                waitRead();
        }
    }

    private void showUserMenu() {
        while (true) {
            System.out.println("Меню пользователя");
            System.out.println("1. Вход в систему");
            System.out.println("2. Регистрация нового пользователя");
            System.out.println("3. Logout");
            System.out.println("0. Вернуться в предыдущее меню");

            System.out.println("\nСделайте выбор пункта меню");
            int input = scanner.nextInt();
            scanner.nextLine();

            // прервать текущий цикл
            if (input == 0) break;

            handleUserMenuUsers(input);

        }
    }

    private void handleUserMenuUsers(int input) {
        switch (input) {
            case 1:
                // Авторизация
                // Todo
                /*
                1. Запросить у пользователя email и пароль
                2. Передать полученные данные в СЕРВИСНЫЙ слой
                3. Получить ответ от сервисного слоя - прошел ли успешно login -
                4. Сообщить пользователю результат
                 */
                break;
            case 2:
                // Регистрация
                // Todo
                /*
                1. Запросить необходимые данные (email, password)
                2. Передать данные в СЕРВИСНЫЙ слой
                3. Получить ответ - передать инфо клиенту
                 */
                System.out.println("Регистрация нового пользователя");
                System.out.println("Введи email:");
                String email = scanner.nextLine();

                System.out.println("Введите пароль: ");
                String password = scanner.nextLine();

                User user = service.registerUser(email, password);

                if (user == null) {
                    System.out.println("Регистрация провалена!");
                } else {
                    System.out.println("Вы успешно зарегистрировались в системе!");
                }

                waitRead();
                break;

            case 3:
                // Logout
                service.logout();
                System.out.println("Вы вышли из системы");
                waitRead();
                break;
        }
    }

    private void waitRead() {
        System.out.println("\nДля продолжения нажмите Enter...");
        scanner.nextLine();
    }

private void  showCarsList(MyList<Car> list) {
        for (Car car : list) {
            System.out.printf("%d. %s (%d г.в). Цена: 2.%f\n",
                    car.getId(), car.getModel(), car.getYear(), car.getPrice());
        }
}


}





















