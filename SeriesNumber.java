/* WAP to print number series */

import java.util.*;
class SeriesNumber
{	public static void main(String args[])
	{
		int i,c,n,j=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2!= 0)
			{
				c=0;
				while(c<5)
				{
					System.out.print(j+"  ");
					j++;
					c++;
				}
				System.out.println("");
			}
			else
			{
				j=j+4;
				c=0;
				while(c<5)
				{
					System.out.print(j+"  ");
					j--;
					c++;
				}
				System.out.println();
				j=j+6;
			}
		}
	}
}
