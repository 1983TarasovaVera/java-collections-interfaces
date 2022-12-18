package com.veraTarasova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        //создание List из массива
        String[] answersSource = {"Да", "Нет", "Не знаю"};
        List<String> answers = Arrays.asList(answersSource);

        //объявление ArrayList, добавление элементов
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(1);
        intList.add(47);
        //добавление по индексу (нельзя добавить элемент с индексом большим длины списка)
        intList.add(0,20);
        //сортировка
        Collections.sort(intList);
        System.out.println(intList);
        //добавление элементов из другой коллекции
        List<Integer> intList1 = new ArrayList<>();
        intList1.addAll(intList);
        //удаление элементов
        //по индексу
        intList.remove(1);
        //по объекту (для чисел)
        intList.remove(Integer.valueOf(10));
        //проверка наличия элемента в списке
        System.out.println(intList.contains(47));
        //проверка, что одна коллекция содержит другую
        System.out.println(intList1.containsAll(intList));
        //длина списка
        System.out.println(intList.size());
        //проверка на пустой список
        System.out.println(intList.isEmpty());
        //итерирование по списку
        for (Integer element : intList) {
            System.out.println(element);
        }
        // Как работает итератор
//        Iterator<Integer> iterator = intList.iterator();
//        while (iterator.hasNext()) {
//            Integer integer = iterator.next();
        //есть возможность удалить элемент коллекции
//            iterator.remove();
//        }
        //Использование stream: преобразование типа данных коллекции
        List<String> collect = intList.stream()
                .map(intSource -> String.valueOf(intSource))
                .collect(Collectors.toList());
        //преобразование в массив toArray
        Object[] objects = intList.toArray(); //возвращает массив ОБЪЕКТОВ
        Integer[] integers = intList.toArray(new Integer[3]);//принимает на вход массив и возвращает массив заданного типа
        //лист из одного элемента
        List<String> strings = Arrays.asList("id");
        List<String> strings1 = Collections.singletonList("id");//более производительный вариант
        //List.of - вид массива будет зависеть от кол-ва переданных элементов. Если 1 - синглтон
        List<String> strings2 = List.of("id"); //singleton
        List<String> strings3 = List.of("id1", "id2");//обычный немодифицируемый лист
        //если нужен модифицируемый лист
        ArrayList<String> strings4 = new ArrayList<>(List.of("id1", "id2"));
        //получить индекс элемента
        System.out.println(strings4.indexOf("id2"));
    }
}
