import calculator.*;

public class Main {
    public static void main(String[] args) {
        int num1_i = 10;
        int num2_i = 5;

        double num1_d = 5.1;
        double num2_d = 0.1;

        //Performing Addition
        int result_i_add = Add.add_two_number(num1_i,num2_i);
        double result_d_add = Add.add_two_number(num1_d,num2_d);

        System.out.println("Addition:");
        System.out.println(num1_i + " + " + num2_i + " = " + result_i_add);
        System.out.println(num1_d + " + " + num2_d + " = " + result_d_add);

        //Performing Subtraction
        int result_i_sub = Subtract.sub_two_number(num1_i,num2_i);
        double result_d_sub = Subtract.sub_two_number(num1_d,num2_d);

        System.out.println("Subtraction:");
        System.out.println(num1_i + " - " + num2_i + " = " + result_i_sub);
        System.out.println(num1_d + " - " + num2_d + " = " + result_d_sub);

        //Performing Multiplication
        int result_i_mul = Multiply.multiply_two_number(num1_i,num2_i);
        double result_d_mul = Multiply.multiply_two_number(num1_d,num2_d);

        System.out.println("Multiplication:");
        System.out.println(num1_i + " * " + num2_i + " = " + result_i_mul);
        System.out.println(num1_d + " * " + num2_d + " = " + result_d_mul);

        //Performing Division
        int result_i_div = Divide.divide_two_number(num1_i,num2_i);
        double result_d_div = Divide.divide_two_number(num1_d,num2_d);

        System.out.println("Division:");
        System.out.println(num1_i + " / " + num2_i + " = " + result_i_div);
        System.out.println(num1_d + " / " + num2_d + " = " + result_d_div);

    }
}