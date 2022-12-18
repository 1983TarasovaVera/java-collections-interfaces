package com.veraTarasova;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayExample {

    public static void main(String[] args) {
        //массив чисел: объявление и инициализация
        int[] id = {1, 2, 3};
        //массив строк: объявление, затем добавление элементов
        String[] answers = new String[3];
        answers[0] = "Да";
        answers[1] = "Нет";
        answers[2] = "Не знаю";
        //сортировка массива
        Arrays.sort(answers);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
        //заполнение массива с использованием цикла for
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 5 - i;
        }
        //сортировка + toString
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
//
//        //Set - коллекция УНИКАЛЬНЫХ элементов (3 вида)
//        //HashSet - неупорядоченное и неотсортированное хранение данных
//         Set<String> stringSet = new HashSet<>();
//         //LinkedHashSet - связанный список, сохраняет порядок добавления эл-тов
//         Set<String> linkedStringSet = new LinkedHashSet<>();
//         //TreeSet - сортировка натуральным образом по красно-черному дереву
//         Set<String> treeStringSet = new TreeSet<>();
//         //Map - ассоциативный массив. Хранение данных в формате ключ-значение
//         //HashMap - самый распространенный вариант
//        // Ключи должны быть уникальными (корректно использовать методы equals, hashCode
//        Map<Integer, String> aMap = new HashMap<>();
//        aMap.put(1, "foo");
//        aMap.put(2, "bar");
//        //получение объекта по массиву
//        aMap.get(1);
//        //получение коллекции значений
//        Collection<String> values = aMap.values();
//        //получение ключей мапы
//        Set<Integer> keySet = aMap.keySet();
//        //получение и ключа, и значения
//        Set<Map.Entry<Integer, String>> entries = aMap.entrySet();
}
