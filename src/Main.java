public class Main {

   public static void checkingLeapYear(int year) {
        boolean leapYear = ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
        if (leapYear) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - невисокосный");
        }
    }

    public static void checkingOS(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculatingDistance(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

//        Task 1

        int year = 2025;
        checkingLeapYear(year);

//        Task 2

        int clientOS = 1;
        int clientDeviceYear = 2025;
        checkingOS(clientOS, clientDeviceYear);

//        Task 3

        int deliveryDistance = 87;
        int deliveryDays = calculatingDistance(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставки нет");
        } else System.out.println("Потребуется дней: " + deliveryDays);

    }
}