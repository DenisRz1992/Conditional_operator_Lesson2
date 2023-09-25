public class Main {
    public static void main(String[] args) {
        System.out.println("Conditional operator. Lesson 2");

//  Задача 1

        int clentOS = 1;
        if (clentOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //  Задача 2

        int clientOS = 0;
        int clientDeviceYear = 2015;
        boolean changes = clientDeviceYear <= 2015;
        if (clientOS == 0) {
            if (changes) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (changes) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Задача 3

        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0 && year > 1584) || year % 400 == 0) {
            System.out.println(year + " - год является високосным");
        } else {
            System.out.println(year + " - год не является високосным");
        }

        // Задача 4

        int deliveryDistance = 10;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryDistance + " дней");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется " + deliveryDistance + " дней + 1 день доставки");
        }
        else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется " + deliveryDistance + " дней + 2 дня доставки");
        } else {
            System.out.println("Доставки нет");
        }

        // Задача 5

        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}