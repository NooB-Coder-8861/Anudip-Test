import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println("Enter two numbers to add");
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                System.out.println("Addition of two given numbers is " + (a1 + a2));
                break;

            case 2:
                System.out.println("Enter two numbers to subtract");
                int b1 = sc.nextInt();
                int b2 = sc.nextInt();
                System.out.println("Subtraction of two given numbers is " + (b1 - b2));
                break;

            case 3:
                System.out.println("Enter two numbers to multiply");
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();
                System.out.println("multiplication of two given numbers is " + (c1 * c2));
                break;

            case 4:
                System.out.println("Enter two numbers to divide");
                int d1 = sc.nextInt();
                int d2 = sc.nextInt();
                double d = d1 / d2;
                System.out.println("Addition of two given numbers is " + d);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
