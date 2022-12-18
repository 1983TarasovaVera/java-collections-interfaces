package com.veraTarasova;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        //Коллекции. Пустой лист.
        Collections.emptyList();
        //Можно использовать в тестах
//        static List<Integer> returnListOfArgumentsGreaterThenZero(int i) {
//          if(i > 0) {
//              return Arrays.asList();
//          }
//          return Collections.emptyList();
//        }
        //Создание синглтон Листа
        List<String> strings1 = Collections.singletonList("id");
        //сортировка
//        Collections.sort();
        //копирование коллекции
//        Collections.copy();

    }

}
