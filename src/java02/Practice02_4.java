package java02;

import java.util.Arrays;

public class Practice02_4 {
    // 중복 제거된 빈 요소는 기본값 0으로 삽입
    public static void main(String[] args) {
        int[] arr = {5, 10, 9, 27, 2, 8, 10, 4, 27, 1};
        int[] result = new int[10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j])) {
                    arr[j] = 0;
                }
            }
            result[i] = arr[i];
        }

        System.out.println("result 배열 값: " + Arrays.toString(result));
    }
}
