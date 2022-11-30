package java02;

public class Practice02_2 {
    public static void main(String[] args) {
        int[] arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] < min) {
                min = arr[i+1];
            }
            if (arr[i+1] > max) {
                max = arr[i+1];
            }
        }

        System.out.println("arr의 최대값: " + max);
        System.out.println("arr의 최소값: " + min);
    }
}
