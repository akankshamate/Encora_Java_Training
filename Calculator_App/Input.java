import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    static int choice=0;
    public int readValue(){
        return sc.nextInt();
    }
    public String readStringValue(){
        return sc.next();
    }

    public int readChoiceValue() {
        Menu menu = new Menu();
        choice = menu.show();

        if (choice >= 1 && choice <= 6) {
            return choice;

        } else {
            System.out.println("Please enter valid choice");
            readChoiceValue();
        }
        return choice;
    }
}
