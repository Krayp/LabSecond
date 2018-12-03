package com.company;

public class Main {


    public void Step (int n)
    {
        System.out.println("Значение  2^n");
        int pow = 1;
        int c = 2;
        for (int i = 1; i <= n; i++)
        {
            pow *= c;
            System.out.println(c + "^" + i + " = " + pow);
        }
    }

    public int fakt (int n) {
        System.out.println("\nРасчёт факториала");
        int fac = 1;
        if ( n < 1 )
            System.out.println("Некорректный ввод!");
        else
            for (int i = 1; i <= n; i++)
                fac *= i;

        return fac;
    }


    public void raschet (int a, int b) {
        System.out.println("\nСумма, разность и произведение 2-х чисел будет равна:");
        int sum, otnemanie, proizvod;
        sum = a + b;
        otnemanie = a - b;
        proizvod = a * b;
        System.out.println("Сумма: " + sum +
                "\nРазность: " + otnemanie +
                "\nПроизведение: " + proizvod);
    }

    public void VP (int h) {
        System.out.println("\nВычисление времени свободного падения тела ");
        final int g = 10;
        int t = 0;
        t = (int)Math.sqrt(2*h/g);
        System.out.println("Время свободного падения = " + t);
    }

    public void katet (int c, int a) {
        System.out.println("\nНахождение длины катета");
        int b = 0;
        if (c < 0 && a < 0)
            System.out.println("Будте внимательны - Неправильный ввод!");
        else
        {
            b = (int)Math.sqrt(a*a + c*c);
            System.out.println("Длина катета = " + b);
        }

    }


    public static void main (String[] args) {
        Main myLab2 = new Main();

        myLab2.Step(5);
        System.out.println("Факториал равен: " + myLab2.fakt(7));
        myLab2.VP(200);
        myLab2.raschet(5,7);
        myLab2.katet(6,9);
    }
}