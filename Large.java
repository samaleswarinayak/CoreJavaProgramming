/* WAP TO FIND THE LARGEST AMONG N NUMBER WITHOUT USING ARRAY */
class Large
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in );
		int i,max=0,num;
		char c;
		do 
		{
			System.out.println("enter a number");
			num=sc.nextInt();
			if(num>max)
			{
				max=num;
			}
			System.out.println("do u want to continue(y/n):");
			c=sc.next().charAt(0);
			if(c=='n')
				break;
		}while(true);
		System.out.println("Greatest number is "+max);
	}
}
