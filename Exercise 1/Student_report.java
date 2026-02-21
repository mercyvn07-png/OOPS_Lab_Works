import java.util.Scanner;

public class Student_report
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
	System.out.print("Enter student name: ");
	String name = myObj.nextLine();
	System.out.print("Enter roll no: ");
	int rollno = myObj.nextInt();
	System.out.print("Is the student present? (true/false): ");
	boolean ispresent = myObj.nextBoolean();
	System.out.print("Enter the student's marks in maths, physics and chemistry respectively\n");
	float mat = myObj.nextFloat();
	float phy = myObj.nextFloat();
	float che = myObj.nextFloat();
	double avg = (mat+phy+che)/3;
	System.out.print("The average marks of the student is " + avg);
    }
}