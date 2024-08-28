public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int clientOS1 = 1;
        int clientDeviceYear = 2011;
        if (clientOS1 == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        int deliveryDistance = 95;
        int time1 = 1;
        int time2 = time1 + 1;
        int time3 = time1 + 2;
        if (deliveryDistance <= 20) {
            System.out.println("На доставку карты на дом потребуется " + time1 + " день");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("На доставку карты на дом потребуется " + time2 + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("На доставку карты на дом потребуется " + time3 + " дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        int year = 2021;
        var result1 = year % 4;
        var result2 = year % 100;
        var result3 = year % 400;
        if (year < 1584) {
            System.out.println("В " + year + " году не было введено понятие високосного года");
        } else if (result1 == 0) {
            System.out.println(+ year + " является високосным годом");
        } else if (result2 > 0) {
            System.out.println(+ year + " не является високосным годом");
        } else if (result3 == 0) {
            System.out.println(+ year + " является високосным годом");
        }

        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
                System.out.println("Данный месяц относится к зимнему сезону");
                break;
            case 2:
                System.out.println("Данный месяц относится к зимнему сезону");
                break;
            case 3:
                System.out.println("Данный месяц относится к зимнему сезону");
                break;
            case 4:
                System.out.println("Данный месяц относится к весеннему сезону");
                break;
            case 5:
                System.out.println("Данный месяц относится к весеннему сезону");
                break;
            case 6:
                System.out.println("Данный месяц относится к весеннему сезону");
                break;
            case 7:
                System.out.println("Данный месяц относится к летнему сезону");
                break;
            case 8:
                System.out.println("Данный месяц относится к летнему сезону");
                break;
            case 9:
                System.out.println("Данный месяц относится к летнему сезону");
                break;
            case 10:
                System.out.println("Данный месяц относится к осеннему сезону");
                break;
            case 11:
                System.out.println("Данный месяц относится к осеннему сезону");
                break;
            case 12:
                System.out.println("Данный месяц относится к осеннему сезону");
                break;
            default:
                System.out.println("В году всего 12 месяцев");
        }
    }
}