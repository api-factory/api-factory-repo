import java.util.Scanner;

public class pallindrome_number {

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
			sum=(sum*10)+r;
			num=num/10;
			
		}
		
		if(n==sum){
		System.out.println("Number is pallinrome");
		}
		
		else{
			System.out.println("Number is not a pallinrome");
		}

	}

}
