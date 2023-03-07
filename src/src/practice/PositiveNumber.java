package practice;

public class PositiveNumber {

    public static boolean positiveNumber(int num1, int num2, int num3) {
        if ((num1 > 0 && num2 <= 0 && num3 <= 0) || (num2 > 0 && num1 <= 0 && num3 <= 0) || (num3 > 0 && num2 <= 0 && num1 <= 0)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(PositiveNumber.positiveNumber(-2, 3, 6));
        System.out.println(PositiveNumber.positiveNumber(-1, 0, 3));
        System.out.println(PositiveNumber.positiveNumber(-2, -6, 2));
        System.out.println(PositiveNumber.positiveNumber(2, 4, 8));
    }
}
