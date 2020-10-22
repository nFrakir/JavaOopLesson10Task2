package com.gmail.seliverstova.hanna;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Integer[] intArray = generateIntArray(10);
        Map<Integer, Integer> intMap = count(intArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(intMap);

        String[] strArray = generateStringArray(10);
        Map <String, Integer> strMap = count(strArray);

        System.out.println(Arrays.toString(strArray));
        System.out.println(strMap);
    }

    private static Integer[] generateIntArray(int n) {
        Integer[] array = new Integer[n];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
        return array;
    }

    private static String[] generateStringArray(int n) {
        String[] array = new String[n];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = "" + rnd.nextInt(10);
        }
        return array;
    }

    private static <T> Map<T, Integer> count(T[] array) {
        Map <T, Integer> numbers = new HashMap<>();
        Integer tmp = 0;

        for (T i : array) {
            tmp = numbers.put(i, 1);
            if (tmp != null) {
                numbers.put(i, tmp + 1);
            }
        }
        return numbers;
    }
}
