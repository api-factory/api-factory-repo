import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		num=s.nextInt();
		int n=num;
		int r=0;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+(r*r*r);
			
		}
		
		if(n==sum){
		System.out.println("Number is armstrong number");
		}
		
		else{
			System.out.println("Number is not a armstrong number");
		}

	}

}


	


