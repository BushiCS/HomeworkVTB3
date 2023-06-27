package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main{
    public static final int ARR_SIZE = 10;

    public static void main(String[] args) {
        System.out.println();
        String[][] someArr = {{"3", "2", "1"}, {"2", "2", "2"}, {"1", "2", "3"}};
        System.out.println("сумма всех чисел в массиве: " + conversionNumbersOfArray(someArr));

    }


    static int conversionNumbersOfArray(String[][] someArr) {
        int sum = 0;
        if (someArr.length > ARR_SIZE) {
            throw new MyArraySizeException("размер массива превышен");
        }
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i].length > ARR_SIZE) {
                throw new MyArraySizeException("размер массива превышен");
            }
            for (int j = 0; j < someArr[i].length; j++) {
                try {
                    sum += Integer.parseInt(someArr[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException("ошибка в [" + i + "][" + j + "]"); // i это строка, j это столбец
                }
            }
        }
        return sum;
    }
}