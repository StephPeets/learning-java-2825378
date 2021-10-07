import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String firstName = "jimbo";
    String jerp = "jerp";
    while (!firstName.equalsIgnoreCase(jerp)) {
        System.out.println("What's your first name?");
        Scanner input = new Scanner(System.in);
        firstName = input.next();
        System.out.printf("Hi, %s!", firstName);


    }

    }
}
