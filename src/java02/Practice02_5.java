package java02;

import java.util.Scanner;

public class Practice02_5 {
    public static void main(String[] args) {
        String[][] alphabets = {
                {"A", "a"}, {"B", "b"}, {"C", "c"},
                {"D", "d"}, {"E", "e"}, {"F", "f"},
                {"G", "g"}, {"H", "h"}, {"I", "i"},
                {"J", "j"}, {"K", "k"}, {"L", "l"},
                {"M", "m"}, {"N", "n"}, {"O", "o"},
                {"P", "p"}, {"Q", "q"}, {"R", "r"},
                {"S", "s"}, {"T", "t"}, {"U", "u"},
                {"V", "v"}, {"W", "w"}, {"X", "x"},
                {"Y", "y"}, {"Z", "z"}
        };

        System.out.println("알파벳 소문자 입력");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.length() > 1) {
            System.out.println("한 글자만 입력");
            return;
        }

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i][1].equals(input)) {
                System.out.println("결과: " + alphabets[i][0]);
            }
        }
    }
}
