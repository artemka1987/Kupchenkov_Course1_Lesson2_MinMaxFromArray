package Kupchenkov_Course1_Lesson2_MinMaxFromArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Artemka on 04.09.2017.
 */
public class MaxMinFromArray {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arraySize;

        Random random = new Random();
        System.out.println("Введите размер масива");
        arraySize = readPositiveIntValueFromConsole();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println("Массив: " + Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println("Минимальное значение: " + array[0] + ", Максимальное значение: " + array[array.length - 1]);
        System.out.println("Минимальное значение: " + getMinValueFromArray(array) + ", Максимальное значение: " + getMaxValueFromArray(array));

    }

    // Метод считывания положительных int с консоли
    public static int readPositiveIntValueFromConsole(){
        int arraySize = 0;
        do{
            while (!scanner.hasNextInt()){
                System.out.println("Вы неверно ввели число , попробуйте еще раз...");
                scanner.next();
            }
            arraySize = scanner.nextInt();
            if (arraySize <= 0){
                System.out.println("Число должно быть положительным");
            }
        }while (arraySize <= 0);
        return arraySize;
    }

    // Метод получения минимального значения в массиве
    public static int getMinValueFromArray(int[] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Метод получения максимального значения в массиве
    public static int getMaxValueFromArray(int[] array){
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
