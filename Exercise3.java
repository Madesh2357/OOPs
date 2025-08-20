import java.util.Scanner;
public class fibonacciRecursion{
	public static int fibonacci(int n){
		if(n <= 1) return n;
		return fibonacci(n-1) + fibonacci(n-2);

}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int terms = sc.nextInt();
		System.out.println("Fibonacci Sequence:");
		for(int i = 0; i < terms; i++){
			System.out.println(fibonacci(i)+ " ");
		
}
}
}
