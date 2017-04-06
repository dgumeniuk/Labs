package net.golovach._CORE._core_0_procedural._0_iteration.XXX;

/**
 * Created by dgumeniuk on 04.04.2017.
 */
public class Example0 {
    public static void main(String[] args) {
//        for (int k = 0; k < 10; k++) {
//            System.out.println(k);
//        }

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
