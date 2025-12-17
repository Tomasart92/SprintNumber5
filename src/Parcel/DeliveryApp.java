package Parcel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeliveryApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static List<Parcel> allParcels = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            showMenu();
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Пожалуйста, введите число.");
                continue;
            }
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                continue;
            }

            switch (choice) {
                case 1:
                    addParcel();
                    break;
                case 2:
                    sendParcels();
                    break;
                case 3:
                    calculateCosts();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 — Добавить посылку");
        System.out.println("2 — Отправить все посылки");
        System.out.println("3 — Посчитать стоимость доставки");
        System.out.println("0 — Завершить");
    }

    // реализуйте методы ниже
    private static void addParcel() {
        System.out.println("Введите тип посылки");
            String type = scanner.nextLine();
        System.out.println("Введите вес посылки");
            int weight = scanner.nextInt();
        scanner.nextLine();                                    // для нормальной работы сканера
        System.out.println("Введите адресс доставки");
            String deliveryAddress = scanner.nextLine();
        System.out.println("Введите день отправки");
            int sendDay = scanner.nextInt();
                if (type.equals("StandardParcel") || type.equals("FragileParcel")) {
                    StandardParcel parcel = new StandardParcel(type, weight, deliveryAddress, sendDay);
                    allParcels.add(parcel);
                } else if (type.equals("PerishableParcel")) {
                    System.out.println("Введите срок срок годности");
                    int timeToLive = scanner.nextInt();
                    PerishableParcel parcel = new PerishableParcel(type, timeToLive, deliveryAddress, sendDay, timeToLive);
                    allParcels.add(parcel);
                }
        // Подсказка: спросите тип посылки и необходимые поля, создайте объект и добавьте в allParcels
    }

    private static void sendParcels() {
        for (Parcel all : allParcels) {
            System.out.println("Посылка" + all);
            all.packageItem();
            all.deliver();
        }
        // Пройти по allParcels, вызвать packageItem() и deliver()
    }

    private static void calculateCosts() {
        double totalCost = 0;
        for (Parcel parcel : allParcels) {
            totalCost += parcel.calculateDeliveryCost();
        }
        System.out.println("Общая стоимость всех доставок: " + totalCost);
    }
}