public class HomeWork5 {
    public static void main(String[] args) {
//задача 1
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // задача 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
//задача 3
        int year = 2002;
        if (year % 4 == 0 && year > 1584) {
            System.out.println(year + " год является високосным.");
        }else {
            System.out.println(year + " год не является високосным.");
        }
// задача 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println( "Потребуется дней: 1" );
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        }else{
            System.out.println("Доставки нет");
        }
// задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года: осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
    }



