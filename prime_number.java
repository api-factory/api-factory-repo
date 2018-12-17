import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		int num,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		num=s.nextInt();
		b=1;
		c=0;
		while(b<=num)
		{
			if((num%b)==0)
			
				c=c+1;
				b=b+1;
				
			}
			if(c==2)
			{
				System.out.println("Number is prime");
			}
			else if(num<0 || num==0 || num==1)
			{
				System.out.println("irrelavent input");
			}
			
			else
			{
				System.out.println("Number is not prime");
			}
		}
		
	}


