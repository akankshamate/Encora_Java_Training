
public class Calculator {


    public static void main(String[] args) {
        String s = null;
        do {
            Input ip = new Input();

            System.out.print("Enter First number:");
            int a = ip.readValue();

            System.out.print("Enter Second number:");
            int b = ip.readValue();

            int ch = ip.readChoiceValue();

            Operations op = new Operations();

            switch (ch) {
                case 1 -> op.add(a, b);
                case 2 -> op.sub(a, b);
                case 3 -> op.mul(a, b);
                case 4 -> {
                    if (b != 0) {
                        op.div(a, b);

                    } else {
                        System.out.println("A number Can not divide by 0");
                    }
                }
                case 5 -> {
                    op.square(a);
                    op.square(b);
                }
                case 6 -> {
                    op.cube(a);
                    op.cube(b);
                }
            }
            System.out.print("Do you want to continue press Y/N:");
            s = ip.readStringValue();
        } while (s.equalsIgnoreCase("Y"));
    }
}
