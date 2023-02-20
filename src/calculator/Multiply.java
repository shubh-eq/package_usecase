package calculator;

import history.History;

public class Multiply {
    public static int multiplyTwoNumber(int num1, int num2) {
        int result = num1 * num2;
        History.insertLatestCalc(num1+" * "+num2+" = "+result);
        return result;
    }

    public static float multiplyTwoNumber(float num1, float num2) {
        float result = num1 * num2;
        History.insertLatestCalc(num1+" * "+num2+" = "+result);
        return result;
    }

    public static double multiplyTwoNumber(double num1, double num2) {
        double result = num1 * num2;
        History.insertLatestCalc(num1+" * "+num2+" = "+result);
        return result;
    }
}
