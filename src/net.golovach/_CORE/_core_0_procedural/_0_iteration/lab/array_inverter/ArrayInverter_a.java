package net.golovach._CORE._core_0_procedural._0_iteration.lab.array_inverter;

import java.util.Arrays;

public class ArrayInverter_a {
    public static void main(String[] args) {
        int[] arrayNull={};
        int[] arrayOne={4};
        int[] arraySome={1, 3};
        int[] arrayMany = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayInverter(arrayNull);
        arrayInverter(arrayOne);
        arrayInverter(arraySome);
        arrayInverter(arrayMany);
    }

    private static void arrayInverter(int[] array) {
        System.out.print(Arrays.toString(array)+" -> ");
        invert(array);
        System.out.println(Arrays.toString(array));
    }


    private static void invert(int[] array) {
        int length=array.length-1;
        if(length<0){
            return;
        }
        for (int i = (length) / 2; i >= 0; i--) {
            int tmp = array[i];
            array[i] = array[length - i];
            array[length - i] = tmp;
        }

    }

}
