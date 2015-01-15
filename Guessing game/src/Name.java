import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
@SuppressWarnings("unused")
class Name
{
	public static void main (String[] args)
	{
		System.out.println("Lets play a game");
		System.out.println("System will output greater than or less than number");

        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        boolean a=true;
        int c=(int) Math.floor(Math.random()*101);
        double decider=Math.random();
        int i=0;
        while(a && i<35){
        	i=i+1;
        	if(c==b){
        	System.out.println("you win");
        	return;
        	}
        	else{
        		if(b>c && decider<0.5){
        		     System.out.println("Lower number please");
        		if(b>c && decider<0.5){
        		     System.out.println("Higher number please")	;
        		}
        		if(b<c && decider>0.5){
        		System.out.println("Higher number please");	
        		}
        		if(b<c && decider>0.5){
            	System.out.println("Lower number please");
        							}
                				}
                }
        		}
        		}
        		
}

