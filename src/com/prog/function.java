package com.prog;

public class function {
    public static void main(String[] args) {
        byte[] array = new byte[] {1, 2, 3};

        int res1 = summaArray(array);
        System.out.println("Result: " + res1);

        byte[] nums = new byte[] {1, 2, 3, 4, 5};

        int res2 = summaArray(nums);
        System.out.println("Result: " + res2);
    }

    public static int summaArray(byte[] arr) {
        int sum = 0;
        for(byte i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
}
