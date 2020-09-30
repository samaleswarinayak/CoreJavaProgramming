import java.util.Scanner;
public class GCD_LCM1
{
    static void gcd(int x, int y)
    {
		int temp1,temp2,lcm;
		temp1 = x;
		temp2 = y;
		while(x != y)
		{
			if(x > y)
			{
				x = x - y;
			}
			else
			{
				y = y - x;
			}
		}
		lcm = (temp1 * temp2)/x;
        System.out.println("The GCD of two numbers is: " + x);
        System.out.println("The LCM of two numbers is: " + lcm);
    } 
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
       gcd(x, y);
        		
    }
}
