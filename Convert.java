/* WAP TO CONVERT DECIMAL TO BINARY */

class Convert
{
    public static void main (String[] args) 
    { 

		int N = 17;  
        int B_Number = 0;  
        int cnt = 0;  
        while (N != 0) 
        {  
            int rem = N % 2;  
            double c = Math.pow(10, cnt);  
            B_Number += rem * c;  
            N /= 2;  
            cnt++;  
        }  
        System.out.println("binary is "+B_Number);
    } 
}
