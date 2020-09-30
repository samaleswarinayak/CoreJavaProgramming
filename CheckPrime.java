class CheckPrime{
	public static void main(String[] args) {
java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();

		boolean result = doCheckPrime(num);	
		if(result == true)
			System.out.println(num+"is prime");
		else
			System.out.println(num+"is not prime");
	}
	static boolean doCheckPrime(int num)
	{

		int i,c=0;
		int res=1;
		for(i=2;i<=(num/i);i++)
		{
			c++;
			if(num%i==0)
			{		
				res++;
				return false;
			}
		}
		System.out.println(""+c);
		return true;
	}
}
