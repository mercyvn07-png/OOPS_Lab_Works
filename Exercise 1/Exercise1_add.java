class Exercise1_add
{
	public int addNum(int A, int B)
	{ 
		return A + B;
	}
	public static void main(String args[])
	{
		Exercise1_add obj = new Exercise1_add();
		int sum = obj.addNum(40, 50);
		System.out.println("The sum of 40 and 50 is: " + sum);
	}
}