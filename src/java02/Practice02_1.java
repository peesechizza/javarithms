package java02;

import java.util.Scanner;

public class Practice02_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 숫자를 입력.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int data : arr) {
            sum += data;
        }

        System.out.print("모든 요소의 합: " + sum);
    }
}
