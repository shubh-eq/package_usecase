package calculator;

import history.History;

public class Subtract {
    public static int subTwoNumber(int num1, int num2) {
        int result = num1 - num2;
        History.insertLatestCalc(num1+" - "+num2+" = "+result);
        return result;
    }

    public static float subTwoNumber(float num1, float num2) {
        float result = num1 - num2;
        History.insertLatestCalc(num1+" - "+num2+" = "+result);
        return result;
    }

    public static double subTwoNumber(double num1, double num2) {
        double result = num1 - num2;
        History.insertLatestCalc(num1+" - "+num2+" = "+result);
        return result;
    }
}
