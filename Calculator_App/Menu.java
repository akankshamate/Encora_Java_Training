import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public int show(){
        System.out.println("Select the Number Choice from below operations:");
        System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Square\n6.Cube\n");
        return sc.nextInt();
    }
}
