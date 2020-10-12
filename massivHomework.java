package lesson1;

import java.util.Arrays;

public class massivHomework {
    public static void main(String[] args) {

        int [] zeroOne = new int[] {0,1,1,0,0,0,1,1,0,1,0,0};

        for (int i = 0; i < zeroOne.length; i++) {
            if (zeroOne[i] == 0) {
                zeroOne[i]++;
            } else {
                zeroOne[i]--;
            }
        }
        System.out.println(Arrays.toString(zeroOne));

        final int SIZEA = 8;
        int [] multiThree = new int[SIZEA];
        int p = 0;
        for (int i = 0; i < multiThree.length; i++) {
            multiThree[i] = p;
            p += 3;
        }

        System.out.println(Arrays.toString(multiThree));


        int [] lessThanSix = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};

        for (int i = 0; i < lessThanSix.length; i++) {
            if (lessThanSix[i] >= 6) {
                continue;
            }
            lessThanSix[i] = 2 * lessThanSix[i];
        }
        System.out.println(Arrays.toString(lessThanSix));



        final int SIZE = 20;

        int[][] squareArray = new int[SIZE][SIZE];
        int n = SIZE;

        for (int i = 0; i < SIZE; i++) {
            n = n - 1;

            for (int j = 0; j < SIZE; j++) {
                squareArray[i][i] = 1;
                squareArray[i][n] = 1;

            }
        }

        for (int[] ints : squareArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }





        int [] findMax = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
        int max = findMax[0];
        int min = findMax[0];

        for (int i = 0; i < findMax.length; i++) {
            if (findMax[i] > max) {
                    max = findMax[i];
                }
        }
        System.out.println("maximal number of array is " + max);

        for (int i = 0; i < findMax.length; i++) {
            if (findMax[i] < min) {
                min = findMax[i];
            }
        }
        System.out.println("minimal number of array is " + min);

        /*testArray(new int[]{1, 2, 3, 4, 5}, 2);*/

        System.out.println(leftAndRight(new int[]{1,8,1,1,1,1}));

    }

    /*Здесь я пытался выполнить последнее задание
    public static void testArray(int[] array, int b) {

        for (int i = 0; i < array.length; i++) {
            int n = i + b;
            if (n > array.length - 1) {
                n = 0;
            }
            array[i] = array[n];
            System.out.println(n);

        }
        System.out.println(Arrays.toString(array));*/

    public static boolean leftAndRight(int [] arrayD) {
        int n = 0;
        int i = 0;

        int sum = sumOfArray(new int[]{1,8,1,1,1,1});

        while (i < arrayD.length) {
            n = arrayD[i] + n;
            i++;
            if (n == sum - n) {
                return true;
            } else {
                continue;
            }
        }
        return false;

        }
        public static int sumOfArray(int [] arrayD) {
            int sum = 0;
            for (int i = 0; i < arrayD.length; i++) {
                sum = sum + arrayD[i];
            }
            return sum;
        }

    }








