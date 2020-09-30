/* WAP TO FIND ALL PRIME NUMBERS BETWEEN A GIVEN RANGE */

class PrimeRange
{
	public static void main(String [] args)
	{
		int i,input,f=0,j,range;
		java.util.Scannersc = new java.util.Scanner(System.in);
		System.out.println("enter the range");
		input=sc.nextInt();
		range=sc.nextInt();
		for(i=input;i<=range;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println("Prime number is :"+i);
			}
			f=0;	
		} 	
	}
}
