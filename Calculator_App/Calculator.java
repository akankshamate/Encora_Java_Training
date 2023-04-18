import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Double a, b, result;
        String operator;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number:");
        a = sc.nextDouble();

        System.out.print("Enter Second number:");
        b = sc.nextDouble();

        System.out.print("Select the operator: +,-,*,/,Sq,cube:");
        operator = sc.next();


        Operations op = new Operations();

        switch (operator) {
            case "+":
                result = op.add(a, b);
                System.out.print("Addition of " + a + " and " + b + " is " + result);

                break;
            case "-":
                result = op.sub(a, b);
                System.out.println("Subtraction of " + a + " and " + b + " is " + result);

                break;
            case "*":
                result = op.mul(a, b);
                System.out.println("Multiplication of " + a + " and " + b + " is " + result);
                break;
            case "/":
                if (b != 0) {
                    result = op.div(a, b);
                    System.out.println("Division of " + a + " and " + b + " is " + result);
                } else {
                    System.out.println("A number Can not divide by 0");
                }
                break;
            case "sq":
                result = op.square(a);
                System.out.println("Square of " + a + " is " + result);
                result= op.square(b);
                System.out.println("Square of " + b + " is " + result);
                break;
            case "cube":
                result = op.cube(a);
                System.out.println("Cube of " + a + " is " + result);
                result = op.cube(b);
                System.out.println("Cube of " + b + " is " + result);
                break;
            default:
                break;

        }
    }
}
