package com.veraTarasova;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        //Map - ассоциативный массив. Хранение данных в формате ключ-значение
        //HashMap - самый распространенный вариант
        // Ключи должны быть уникальными
        Map<Integer, String> aMap = new HashMap<>();
        //добавление элементов
        aMap.put(1, "да");
        aMap.put(2, "нет");
        aMap.put(3, "не знаю");
        //получение объекта по ключу
        aMap.get(1);
        //получение коллекции значений
        Collection<String> values = aMap.values();
        //получение ключей мапы
        Set<Integer> keySet = aMap.keySet();
        //получение и ключа, и значения
        Set<Map.Entry<Integer, String>> entries = aMap.entrySet();
    }
}
