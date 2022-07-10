package Questions;
import java.util.Scanner;
public class FirstLetterPrinter {
public static void main (String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the String");
 String input = in.nextLine();
System.out.println(firstLetterPrinter(input));
in.close();
}
static String firstLetterPrinter(String str) {
 // write your code here
	
	String s1[]=str.split(" ");
	String s3="";
	for(int i=0;i<s1.length;i++) {
		String s2[]=s1[i].split("");
		s3=s3+s2[0];
		
		
		
	}
	
	return s3;
	
	

 }
}






//Input:
//When nothing goes right, go left.
//Output:
//Wngrgl
//Test case 2