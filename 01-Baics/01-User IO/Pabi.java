/*Complete the function printNumber which takes an integer input from the user and prints it on the screen.

Use:-
for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log() */

//used scanner class to taker input and print using sout.
import java.util.Scanner;

public class Pabi {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        System.out.println("Entered Number is " + num);

        System.out.println("Enter a Byte:");
        byte num2 = sc.nextByte();
        System.out.println("Entered byte is " + num2);

        System.out.println("Enter a Short:");
        short num3 = sc.nextShort();
        System.out.println("Entered Short is " + num3);

        System.out.println("Enter a long:");
        long num4 = sc.nextLong();
        System.out.println("Entered long is " + num4);

        System.out.println("Enter a float:");
        float num5 = sc.nextFloat();
        System.out.println("Entered float is " + num5);

        System.out.println("Enter a doauble:");
        double num6 = sc.nextDouble();
        System.out.println("Entered double is " + num6);

        System.out.println("Enter a Bool:");
        boolean num7 = sc.nextBoolean();
        System.out.println("Entered bool is " + num7);

        sc.close();
    }
}
