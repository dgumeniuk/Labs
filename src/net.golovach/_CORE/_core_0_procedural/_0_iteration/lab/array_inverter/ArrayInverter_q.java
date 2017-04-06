package net.golovach._CORE._core_0_procedural._0_iteration.lab.array_inverter;

import java.util.Arrays;

public class ArrayInverter_q {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
        invert(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(new float[]{1f, 2.3f, 3, 5.6f, 6, 8.0f}));
        System.out.println(3/6.1);
        System.out.println(1.0 % 0.0);
        switchNOTmpDemo();
        toString(array);
        StringBuilder str = new StringBuilder();
        str.append(56);
        str.insert(2, 4);
        System.out.println(str);
        // TODO: 07.04.2017 delete some chars from string

    }

    private static void switchNOTmpDemo() {
        int a = 2;
        int b = 3;
        System.out.println("a=" + a + " b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
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
