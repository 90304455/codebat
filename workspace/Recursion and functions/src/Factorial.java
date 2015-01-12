/**
 * 
 */
import java.util.Scanner;
/**
 * @author 90304455
 *
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number you want to find the factorial of:");
		long a=input.nextLong();
		System.out.print(factorial(a)+"\n");
		System.out.print("do you want fibbonacci, 2 or n");
		Scanner input1=new Scanner(System.in);
		String h=input1.next();
		System.out.print("the string you inputted was:"+h);
		if (h=="y" || h=="Y"){
			System.out.println("Enter the number you want to find the fibbonaci of:");
			Scanner input11=new Scanner(System.in);
			long num=input11.nextLong();
			System.out.print(fib(num));
			return;
		}
		else{
			System.out.println("Mimic function was executed");
			mimic();
		}
		while(true){
			mimic();
		}
	}
	public static void mimic(){
		Scanner input=new Scanner(System.in,"UTF-8");
		String a=input.next();
		System.out.print(a);
	}
	public static long  factorial(long  number){
		if (number==1){
			return 1;
		}
		else{
			return number=number*factorial(number-1);
		}
	}
	public static long fib(long number){
	if (number==1 || number==2){
		return 1;
	}
	return fib(number-1)+fib(number-2);
	
}
}



