import java.util.Scanner;

public class Data_operations
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = myObj.nextInt();
        System.out.print("Enter second number: ");
        int b = myObj.nextInt();

        System.out.println("\nArithmetic operators");
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));

        System.out.println("\nUnary operators");
        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);
        System.out.println("Increment (++a): " + (++a));
        System.out.println("Decrement (--b): " + (--b));

        System.out.println("\nRelational operators");
        System.out.println("a > b: " + (a>b));
        System.out.println("a < b: " + (a<b));
        System.out.println("a >= b: " + (a>=b));
        System.out.println("a <= b: " + (a<=b));
        System.out.println("a == b: " + (a==b));
        System.out.println("a != b: " + (a!=b));

        boolean x = a>b;
        boolean y = a<b;

        System.out.println("\nLogical operators");
        System.out.println("x && y: " + (x&&y));
        System.out.println("x || y: " + (x||y));
        System.out.println("!x: " + (!x));
        System.out.println("!y: " + (!y));
    }
}
