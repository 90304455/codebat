import java.util.Scanner; //scanner class

public class Nme {
	///note this will make it runnable from outside of codebat.
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	backAround(input);
	}


	public static String backAround(String str) {
	if(str.length()>0){
	char a=str.charAt(str.length()-1);  //select the last character.
	return a+str+a; //add the last character both to the back and to the front.
	//this is the code you would enter for codebat.}
	}
	else{
	  return str;
		}
			}

}
