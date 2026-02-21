class Exercise1_avg
{
	public int findAvg(int A, int B, int C)
	{
		return (A + B + C)/3;
	}
	public static void main (String args[])
	{
		Exercise1_avg obj = new Exercise1_avg();
		int avg = obj.findAvg(10, 20, 30);
		System.out.println("The average of 10, 20 and 30 is: " + avg);
	}
}