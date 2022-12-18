package com.veraTarasova;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        //Set - коллекция УНИКАЛЬНЫХ элементов (3 вида)
        //HashSet - неупорядоченное и неотсортированное хранение данных
         Set<String> stringSet = new HashSet<>();
         //добавление элементов
         stringSet.add("да");
         stringSet.add("нет");
         stringSet.add("не знаю");
         //итерирование по коллекции
        for (String element : stringSet) {
            System.out.println(element);
        }
        //удаление элементов
        stringSet.remove("не знаю");
        //удаление всех элеметов
        stringSet.clear();
         //LinkedHashSet - связанный список, сохраняет порядок добавления эл-тов
         Set<String> linkedStringSet = new LinkedHashSet<>();
         //TreeSet - сортировка натуральным образом по красно-черному дереву
         Set<String> treeStringSet = new TreeSet<>();
    }
}
