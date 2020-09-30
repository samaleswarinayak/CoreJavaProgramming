/* WAP TO FIND ALL ARMSTRONG NUMBER BETWEEN A GIVEN RANGE */

import java.util.Scanner;
class ArmstrongRange
{
    public static void main(String args[])
    {
		int num, start, end, i, rem, temp, counter=0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number: ");
		start = sc.nextInt();
		System.out.print("Enter the end number: ");
		end = sc.nextInt();

		for(i=start+1; i<end; i++)
		{
		    temp = i;
			num = 0;
			while(temp != 0)
			{
				rem = temp%10;
				num = num + rem*rem*rem;
				temp = temp/10;
			}
			if(i == num)
			{
				if(counter == 0)
				{
					System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
				}
				System.out.print(i + "  ");
			    counter++;
			}
		}
		if(counter == 0)
		{
			System.out.print("There is no Armstrong number Between "+start+" and "+end);
		}
	}
}
