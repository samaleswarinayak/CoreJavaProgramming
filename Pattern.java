/* Print the following series */

import java.util.*;
class Pattern
{
	
	public static void main(String args[])
	{
		int i,n,c,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
					System.out.print("0  ");
			else
					System.out.print("1  ");
			}
			System.out.println("");
		}
	}
}
