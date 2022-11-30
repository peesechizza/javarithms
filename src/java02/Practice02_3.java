package java02;

import java.sql.SQLOutput;

public class Practice02_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {2, 3, 1};

        boolean isContain = false;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isContain = true;
                    break;
                }
            }

            if (!isContain) {
                System.out.println("arr1과 arr2는 다른 배열");
                break;
            } else if (i + 1 == arr1.length) { // 배열 요소를 모두 비교한 뒤 결과 출력 위한 조건
                System.out.println("arr1과 arr2는 같은 배열");
            }
        }

    }
}
