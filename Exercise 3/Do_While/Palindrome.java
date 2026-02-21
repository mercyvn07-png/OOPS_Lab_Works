import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        int original = num;
        int reverse = 0;
        do 
	{
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        } 
	while (num > 0);
        if (original == reverse)
	{
            System.out.println("Palindrome Number");
	}
        else
	{
            System.out.println("Not Palindrome Number");
	}
    }
}