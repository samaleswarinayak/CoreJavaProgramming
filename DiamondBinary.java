/* WAP to print binary number diamond pattern */

import java.util.*;
class DiamondBinary
{
	
	public static void main(String args[])
	{
		int i,n,c,j,k,sp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j<=n-i)
				{
					System.out.print("   ");
				}
				else
				{
					if((i+j)%2==0)
						System.out.print("0  ");
					else
						System.out.print("1  ");
					
				}
			}
			for(k=n-1;k>n-i;k--)
			{
				if((i+k)%2==0)
					System.out.print("0  ");
				
				else
					System.out.print("1  ");
				
			}
			System.out.println("");
		}
		for(i=n-1;i>0;i--)
		{
			for(j=n;j>0;j--)
			{
				if(j>i)
				{
					System.out.print("   ");
				}
				else
				{
					if((i+j)%2==0)
						System.out.print("0  ");
					else
						System.out.print("1  ");
					
				}
			}
			for(k=n-1;k>n-i;k--)
			{
				if((i+k)%2==0)
					System.out.print("0  ");
				
				else
					System.out.print("1  ");
				
			}
			
			System.out.println("");
		}
		
	}
}
