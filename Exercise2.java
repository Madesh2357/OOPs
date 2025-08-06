package Java;
import java.util.Scanner;
public class prime_check {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A positive integer:");
		int num = sc.nextInt();
		if(num ==0 || num ==1) {
			System.out.println(num+" is neither a Prime nor a Composite number");
		}
		
		else {
			for(int i = 2; i <= num; i++) {
				if(i % num != 0) {
					System.out.println(num + "is not a Prime Number");
					break;
				}
				else {
					System.out.println(num + "is a Prime Number");
		
				}
	}
}
}
}
