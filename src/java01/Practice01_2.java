package java01;

public class Practice01_2 {
    public static void main(String[] args) {
        int max = maxValue(20, 31, 15, 31, 7);
        System.out.println("최댓값: " + max);
    }

    public static int maxValue(int number1, int number2, int number3, int number4, int number5) {
        int max = number1;

        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        if (number4 > max) {
            max = number4;
        }

        if (number5 > max) {
            max = number5;
        }

        return max;
    }
}
