/* WAP TO CHECK IF A NUMBER IS PALINDROME OR NOT */

class Palindrome
{  
   public static void main(String args[])
   {  
      java.util.Scanner sc= new java.util.Scanner(System.in);
      int r,sum=0,temp;    
      int n;
      System.out.println("enter the number");
      n=sc.nextInt();
      int num=n;
      temp=n;    
      while(n>0)
      {    
        r=n%10;    
        sum=(sum*10)+r;    
        n=n/10;    
      }    
      if(temp==sum)    
       System.out.println(num+" is a palindrome number ");    
      else    
       System.out.println(num+" is not a palindrome");    
    }  
    } 
