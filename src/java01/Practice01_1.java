package java01;

public class Practice01_1 {
    public static void main(String[] args) {
        int min = minValue(5, 9, 2, 13);
        System.out.println("최솟값: " + min);
    }

    public static int minValue(int number1, int number2, int number3, int number4) {
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        return min;
    }

}
