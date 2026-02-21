import java.util.Scanner;

class Greater_number 
{
    public static void main(String[] args) 
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = myObj.nextInt();
        System.out.print("Enter second number: ");
        int b = myObj.nextInt();
        if (a > b) 
        {
            System.out.println("First number is bigger");
        }
        else if (b > a) 
        {
            System.out.println("Second number is bigger");
        } 
        else 
        {
            System.out.println("Both numbers are equal");
        }
    }
}