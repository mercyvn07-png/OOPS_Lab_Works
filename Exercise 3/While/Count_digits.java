import java.util.Scanner;

class Count_digits 
{
    public static void main(String[] args) 
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = myObj.nextInt();
        int count = 0;
        while (num != 0) 
        {
            num = num / 10;
            count++;
        }
        System.out.println("Total digits = " + count);
    }
}