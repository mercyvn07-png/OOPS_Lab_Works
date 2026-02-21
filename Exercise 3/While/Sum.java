import java.util.Scanner;
class Sum 
{
    public static void main(String[] args) 
    {
	Scanner myObj = new Scanner(System.in);
        int i = 1;
	int sum = 0;
	System.out.print("Enter a number: ");
	int num = myObj.nextInt();
        while (i <= num) 
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}