package java02;

public class Practice02_2 {
    public static void main(String[] args) {
        int[] arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};

        int min = arr[0];
        int max = arr[0];

        for (int data : arr) {
            if (data < min) {
                min = data;
            }
            if (data > max) {
                max = data;
            }
        }

        System.out.println("arr의 최대값: " + max);
        System.out.println("arr의 최소값: " + min);
    }
}
