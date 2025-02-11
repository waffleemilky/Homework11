public class Main {

    public static String checkingLeapYear(int year) {
        boolean leapYear = ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
        if (leapYear) {
            return year + " год - високосный";
        } else {
            return year + " год - невисокосный";
        }
    }

    public static String checkingOS(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            return "Установите облегчённую версию приложения для IOS по ссылке";
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            return "Установите версию приложения для IOS по ссылке";
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            return "Установите облегчённую версию приложения для Android по ссылке";
        } else {
            return "Установите версию приложения для Android по ссылке";
        }
    }

    public static String calculatingDistance(int distance) {
        if (distance <= 20) {
            return "Потребуется дней: 1";
        } else if (distance > 20 && distance < 60) {
            return "Потребуется дней: 2";
        } else if (distance >= 60 && distance < 100) {
            return "Потребуется дней: 3";
        } else {
            return "Доставки нет";
        }
    }

    public static void main(String[] args) {

//        Task 1

        System.out.println(checkingLeapYear(2025));

//        Task 2

        System.out.println(checkingOS(1, 2025));

//        Task 3

        System.out.println(calculatingDistance(19));

    }
}