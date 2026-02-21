import java.util.Scanner;

class Even_odd 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        if (num % 2 == 0) 
        {
            System.out.println("Number is Even");
        } 
        else 
        {
            System.out.println("Number is Odd");
        }
    }
}