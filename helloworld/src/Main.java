import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Print Functions
        System.out.println("Hello World!");
        System.out.println("I love  Java!");

        System.out.print("My Name is Abir!\n");

        System.out.printf("Here is a number %d", 10);

//      Scan Function

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        System.out.println("Here is a number " + a);

        String smallStr = scan.next();
        System.out.println("My nickname is " + smallStr);

        String fullName = scan.nextLine();
        System.out.println("My full name is " + fullName);
    }
}