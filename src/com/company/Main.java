package com.company;

public class Main {

    public static void main(String[] args) {
            Vector3D vectorA = new Vector3D(15, 54.8, -32);
            Vector3D vectorB = new Vector3D(63, -5, 41);
            System.out.format("Ось вектора А %s.\n", vectorA);
            System.out.format("Ось вектора В %s.\n", vectorB);
            System.out.format("Длина вектора А %s.\n", vectorA.getModule());
            System.out.format("Длина вектора В %s.\n", vectorB.getModule());
            System.out.format("Сумма векторов равна %s.\n", vectorA.getAddition(vectorB));
            System.out.format("Разница векторов %s.\n", vectorA.getSubtraction(vectorB));
            System.out.format("Скалярное произведение %s.\n", vectorA.getScalar(vectorB));
            System.out.format("Векторное произведение %s.\n", vectorA.getVector(vectorB));

        }
    }
//        Основное задание
//        1. Создайте класс, который описывает вектор в двумерной системе
//        координат.
//                Создайте класс, который описывает вектор в трехмерной системе
//        координат.
//                У каждого класса должны быть:
//        - конструктор с параметрами в виде списка координат (например, x,
//                y, z);
//        - метод, вычисляющий длину вектора. Корень можно посчитать с
//        помощью Math.sqrt();
//        - метод, вычисляющий скалярное произведение;
//        - метод сложения векторов;
//        - метод разности векторов;
//        - статический метод, который принимает целое число N, и
//        возвращает массив случайных векторов размером N.
//        Предусмотреть метод сравнение векторов.
//        Предусмотреть метод для вывода информации о векторе.
//                Каждый из классов должен иметь константу, содержащею описание
//        вектора.
//                Например, "Это вектор для двумерной системы координат".
//                Эта константа так же должна выводиться в методе для вывода
//        информации о векторе.
