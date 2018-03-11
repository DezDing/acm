package org.dy.test;

public class Sort {
    public static void selSort(int[] numbers){
        int size = numbers.length;
        int temp;
        for (int i = 0; i < size; i++)
        {
            int k = i;
            for (int j = size-1;j>i;j--){
                if (numbers[j] < numbers[k]){
                    k = j;
                }
            }

            temp = numbers[k];
            numbers[k] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void insertSort(int[] numbers){
        int size = numbers.length;
        int temp = 0 ;
        int j =  0;

        for(int i = 0 ; i < size ; i++)
        {
            temp = numbers[i];
            //假如temp比前面的值小，则将前面的值后移
            for(j = i ; j > 0 && temp < numbers[j-1] ; j --)
            {
                numbers[j] = numbers[j-1];
            }
            numbers[j] = temp;
        }
    }
}
