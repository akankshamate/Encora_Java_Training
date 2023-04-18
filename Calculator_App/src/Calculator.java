import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Double a,b;
        String operator;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number:");
        a=sc.nextDouble();

        System.out.print("Enter Second number:");
        b= sc.nextDouble();

        System.out.print("Select the operator: +,-,*,/,Sq,cube:");
        operator=sc.next();


        Operations op=new Operations();

        switch(operator){
            case "+":
                op.add(a,b);
                break;
            case "-":
                op.sub(a,b);
                break;
            case "*":
                op.mul(a,b);
                break;
            case "/":
                op.div(a,b);
                break;
            case "sq":
                op.square(a);
                break;
            case "cube":
                op.cube(a);
                break;

        }
    }
}
