package calculator;

import history.History;

public class Divide {
    public static int divideTwoNumber(int num1, int num2) {
        int result = num1 / num2;
        History.insertLatestCalc(num1+" / "+num2+" = "+result);
        return result;
    }

    public static float divideTwoNumber(float num1, float num2) {
        float result = num1 / num2;
        History.insertLatestCalc(num1+" / "+num2+" = "+result);
        return result;
    }

    public static double divideTwoNumber(double num1, double num2) {
        double result = num1 / num2;
        History.insertLatestCalc(num1+" / "+num2+" = "+result);
        return result;
    }
}
