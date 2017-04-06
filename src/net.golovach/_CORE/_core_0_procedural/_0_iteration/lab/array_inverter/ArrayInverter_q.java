package net.golovach._CORE._core_0_procedural._0_iteration.lab.array_inverter;

import java.util.Arrays;

public class ArrayInverter_q {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        invert(array);
//        toString(array);
        System.out.println(Arrays.toString(array));
    }

    private static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

    }

    private static void toString(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "]");
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }
}
