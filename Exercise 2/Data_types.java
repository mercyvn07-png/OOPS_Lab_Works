class Data_types
{
    public static void main(String[] args)
    {
        byte year = 1;
        short rollno = 27;
        int totalmarks = 450;
        long regno = 25227;
        double attendance = 92.572;
        float cgpa = 8.61f;
        char grade = 'A';
        boolean passed = true;

        System.out.println("------ Studentb Profile ------");
        System.out.println("Year of study: " + year);
        System.out.println("Roll number: " + rollno);
        System.out.println("Register number: " + regno);
        System.out.println("Total marks: " + totalmarks);
        System.out.println("Attendance: " + attendance);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);

        if (passed==true)
        {
            System.out.println("Result status: Passed");
        }
        else
        {
            System.out.println("Result status: Failed");
        }
    }
}