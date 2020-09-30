/* WAP TO CHECK A CHARACTER IS VOWEL AND ALSO PRINT ITS CORRESPONDING ASCII VALUE */

import java.util.*;
class VowelConsonant
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a alphabet");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch + " is a vowel");
			System.out.println("The ascill value of " + ch + " is " + (int)ch );
		}
		else
		{
			System.out.println(ch + " is a consonent");
			System.out.println("the ascill value of " + ch + " is " + (int)ch);
		}		
	}
}
