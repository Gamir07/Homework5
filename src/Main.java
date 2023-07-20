public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        // не совсем понял про вложенность больше 2х этажей. 2х этажная вложенность значит наличие 1-го if'а внутри другого? т.е. в таком случае мой код правильно написан.
        System.out.println("Задача 2");
        int clientOS = 1;
        int yearOfProduction = 2013;
        if (clientOS == 0) {
            if (yearOfProduction < 2015) {
                System.out.println("Установите обегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 1) {
            if (yearOfProduction < 2015) {
                System.out.println("Установите обегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2400;
        if (year % 400 == 0 ) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if(year % 4 == 0){
            System.out.println(year + " год  является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + day);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + (day + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней " + (day + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case (1):
            case (2):
            case (12):
                System.out.println("Зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("Весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("Лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("Осень");
                break;
            //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
            //верно ли я понял что надо использовать дефолтную реализацию если № месяца больше 12 или меньше 1
            default:
                System.out.println("Неверно введен номер месяца");
        }
    }


}