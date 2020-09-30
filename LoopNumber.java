/* WAP TO FIND RELATED NUMBERS LIKE THIS square(12) = 144 square(21) = 441 (reverse of 144) AND 21 IS REVERSE OF 12 */

import java.util.*;
class LoopNumber
{
    public static void main(String args[])
    {
        int n1,n2,i,no,l,rev;
        double p;
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
        n1=sc.nextInt();
        n2=sc.nextInt();
		System.out.println("The Number are");
        for(i=n1;i<=n2;i++)
        {
            rev=0;
            no=i*i;
            while(no!=0)
            {
                l=no%10;
                rev=rev*10+l;
                no=no/10;
            }
            p=Math.sqrt(rev);
            rev=0;

            no=(int)p;
            while(no!=0)
            {
                l=no%10;
                rev=rev*10+l;
                no=no/10;                   
            }

            if(i==rev)
				System.out.print(i+"  ");
        }    
    }    
}

