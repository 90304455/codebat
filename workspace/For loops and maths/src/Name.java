/**
 * 
 */
import java.util.Scanner;
import java.math.*;
/**
 * @author 90304455
 *
 */
@SuppressWarnings("unused")
public class Name {


	public static void main(String[] args) {
		System.out.println("Enter a complex number of the form a+bi here");
		Scanner input=new Scanner(System.in);
		double  a=input.nextDouble();
		System.out.println("Thank  you for inputting a now enter b");
		Scanner input1=new Scanner(System.in);
		double b=input1.nextDouble();
		System.out.println("Thank  you for inputting B, here are the propertys of the complex number");
		double mag=mag(a,b);
		double angle=Math.atan(b/a);
		System.out.println("Here is the mag"+" "+mag);
		System.out.println("Here is the angle"+" "+angle);
		System.out.println("1,2,3, okay.");
		Scanner inputk=new Scanner(System.in);
		int Q=inputk.nextInt();
		if(Q==1){
			return;
		}
		if(Q==2){
			System.out.println("Just type in the first letter of any complex operation");
			System.out.println("Just type in two complex numbers after you have typed in the first letter of the operation");
			Scanner inputE=new Scanner(System.in);
			String t=inputE.next();
			Scanner inputF=new Scanner(System.in);
			double v=inputF.nextDouble();
			Scanner inputG=new Scanner(System.in);
			double q=inputG.nextDouble();
			Scanner inputH=new Scanner(System.in);
			double A=inputH.nextDouble();
			Scanner inputI=new Scanner(System.in);
			double H=inputH.nextDouble();
			Operation(t,v,q,A,H);
		}
	}

	private static void Operation(String t, double v, double q, double A,
			double H) {		
			if(t.equals("a")){
				System.out.println("the sum of these two complex numbers is");
				double U=v+A;
				double E=q+H;
				String U_2= String.valueOf(U);
				System.out.println((U_2)+"+"+E+"i");
			if(t.equals("m")){
			  /*(a+bi)*(c+di)=
			  * (ac)+(a*di)+(c*di)+(bi*di)
			  * (ac)+(a*di)+(c*di)-(bd)
			  * (ac)-(bd)+(a*di)+(c*di)
			  * (v+qi)(A+Hi)
			  * (vA)-(qH)+(v*H*i)+(A*H*i)
			  */
				double SI=v*A-q*H;
				double DT=v*H+A*H;
				String SI_2= String.valueOf(SI);
				System.out.println("Here is the result:");
				System.out.println((SI_2)+"+"+DT+"i");
			}
			if(t.equals("c")){
				System.out.println("Input a complex number to be conjugated");
				Scanner inputEIU=new Scanner(System.in);
				double R=inputEIU.nextDouble();
				Scanner input1=new Scanner(System.in);
				double EE=input1.nextDouble();
			}
			if(t.equals("p")){
				System.out.println("Enter a complex number to be converted into cis form");
				Scanner inputEIU_2=new Scanner(System.in);
				double R=inputEIU_2.nextDouble();
				Scanner inputRUE=new Scanner(System.in);
				double R__=inputRUE.nextDouble();
				System.out.println("Here is your complex number in cis form");
				double R_=mag(v,q);
				double[] a1=po(v,q);
				System.out.println(R_+" "+"cis"+" "+a1[2]);
			}
			if(t.equals("c")){
				System.out.println("Enter a number in cis form and it will be converted to a rectagular  number to stick up your ass");
				Scanner inputEIU_23=new Scanner(System.in);
				double R=inputEIU_23.nextDouble();
				Scanner inputRU1E=new Scanner(System.in);
				double R__=inputRU1E.nextDouble();
				double d[]=cart(R,R__);
				double c=d[0];
				double jhth=d[1];
				System.out.println(c+"+"+jhth+"i");
			if(t.equals("d")){
				System.out.println("this will divide complex numbers");
				double c1=mag(v,q)/mag(A,H);
				double thet1=Math.atan(q/v)-Math.atan(H/A);
				double a3[]=cart(c1,thet1);
				System.out.println(a3[0]+"+"+a3[1]+"i");
			}
			if(t.equals("e")){
				System.out.println("This will raise a complex number to a nth power");
				System.out.println("Please enter a complex number and a power");
				

			}
			}
			}
			}
			
			
			
 					
						
		
	

	private static void mandelbrot(double a, double b, int c) {
		return;
	}
	private static double mag(double a, double b){
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	}
	private static void Conj(double a, double b) {
		double FTE=b*-1;
		System.out.println(a+"+"+FTE+"i");
		return;
	}
	private static double[] po(double a,double b){
		double mag=mag(a,b);
		double angle=Math.atan(b/a);
		double H=mag*Math.cos(angle);
		double Q=mag*Math.sin(angle);
		double[] a1={Q,H,angle};
		return a1;
		}
	private static double[] cart(double R,double thet){
		double d=R*Math.cos(thet);
		double i=R*Math.sin(thet);
		double[] Cararart={d,i};
		return Cararart;

	}

}



	