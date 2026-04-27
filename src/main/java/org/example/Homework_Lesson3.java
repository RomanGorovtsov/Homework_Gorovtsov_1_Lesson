package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Homework_Lesson3 {

    public static void main(String[] args) {
        String[] PetersCart = {"Chicken", "Bananas", "cottage cheese"};
        String[] NicosCart = {"Chicken", "Bananas", "cottage cheese"};
        String[] TerentiesCart = {"Beer", "Pelmeni", "laska black magic"};

        //сравнение количества товаров в корзинах
        comparisonOfTheNumberOfGoods(PetersCart, NicosCart);
        comparisonOfTheNumberOfGoods(PetersCart, TerentiesCart);

        //сравнение содержимого корзин
        compareItemsInTheCart(PetersCart, NicosCart);
        compareItemsInTheCart(PetersCart, TerentiesCart);

        //исследование на самое короткое, длинное и среднюю длину названия продуктов
        productsResearch(PetersCart, NicosCart, TerentiesCart);

    }

    public static void comparisonOfTheNumberOfGoods(String[] arr1, String[] arr2) {
        if (arr1.length > arr2.length) System.out.println("Товаров больше в первой корзине");
        else if (arr1.length < arr2.length) System.out.println("Товаров больше во второй корзине");
        else System.out.println("Товаров одинаковое количество в обеих корзинах");
    }

    public static void compareItemsInTheCart(String[] arr1, String[] arr2) {
        var list1 = Arrays.stream(arr1).map(String::toLowerCase).distinct().sorted().toList();
        var list2 = Arrays.stream(arr2).map(String::toLowerCase).distinct().sorted().toList();

        if (list1.equals(list2)) {
            System.out.println("Наборы товаров одинаковые");
        } else {
            System.out.println("Наборы товаров разные");
        }
    }

    public static void productsResearch(String[] arr1, String[] arr2, String[] arr3){
        String theLongestNameOfProduct = Stream.of(arr1, arr2, arr3).flatMap(Arrays::stream).max(Comparator.comparingInt(String::length)).orElse("Не найдено");
        String theShortestNameOfProduct = Stream.of(arr1, arr2, arr3).flatMap(Arrays::stream).min(Comparator.comparingInt(String::length)).orElse("Не найдено");
        double theAvgLengthNameOfProductArr = Stream.of(arr1, arr2, arr3).flatMap(Arrays::stream).mapToInt(String::length).average().orElse(0.0);

        System.out.println("Самое длинное название продукта в корзинах: " + theLongestNameOfProduct);
        System.out.println("Самое короткое название продукта в корзинах: " + theShortestNameOfProduct);
        System.out.println("Средняя длина названия продукта в корзинах: " + String.format("%.2f", theAvgLengthNameOfProductArr));

    }
}
