package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложение для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2

        int ClientDeviceYear = 2012;
        if (clientOS == 0 && ClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && ClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && ClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && ClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Год является високосным");
        } else {
            System.out.println(year + "Год не является високосным");
        }

        //Задание 4
        int DeliveryDistance = 95;
        int DeliveryDays = 1;
        if (DeliveryDistance <= 20) {
            System.out.println("доставка займет " + DeliveryDays + " дней");
        } else if (DeliveryDistance >20 && DeliveryDistance<= 60) {
            System.out.println("доставка займет " + (DeliveryDays+1) + " дней");
        } else if (DeliveryDistance >60 && DeliveryDistance<=100) {
            System.out.println("Доставка займет " + (DeliveryDays+2) + " дней");
        } else if (DeliveryDistance >100) {
            System.out.println("нет доставки");
        }

        //Задание 5
        int monthNumber = 12;
        if (monthNumber >=1 && monthNumber <=12) {
            System.out.println("этот месяц относится к сезону ");
          switch (monthNumber) {
              case 1:
              case 2:
                  System.out.println("Зима");
                  break;
              case 3:
              case 4:
              case 5:
                  System.out.println("Весна");
                  break;
              case 6:
              case 7:
              case 8:
                  System.out.println("Лето");
                  break;
              case 9:
              case 10:
              case 11:
                  System.out.println("Осень");
                  break;
              case 12:
                  System.out.println("Зима");
                  break;
              default:
                  System.out.println("Такого месяца нет");
          }
        }

    }
}
