import java.util.Scanner;
public class prime_check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A positive integer:");
		int num = sc.nextInt();
		boolean isprime = true;
		if(num <=1)
			isprime = false;

		else{
			for(int i = 2; i <= Math.sqrt(num); i++){
				if(num%i == 0){
					isprime = false;
					break;
}
}
}
		if(isprime)
			System.out.println(num+" is a Prime Number");

		else
			System.out.println(num+" is not a Prime Number");
		
	}
}
