public class Operations {
    int result;
    public void add(int a, int b) {
        result=a+b;
        System.out.println("Addition of " + a + " and " + b + " is " + result);
    }

    public void sub(int a, int b) {
        result=a-b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + result);
    }

    public void mul(int a, int b) {
        result=a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + result);
    }

    public void div(int a, int b) {
        result=a/b;
        System.out.println("Division of " + a + " and " + b + " is " + result);
    }

    public void square(int a) {
        result=a*a;
        System.out.println("Square of " + a + " is " + result);
    }

    public void cube(int a) {
        result=a*a*a;
        System.out.println("Cube of " + a + " is " + result);
    }
}
