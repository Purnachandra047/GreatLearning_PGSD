package Questions;

import java.util.Scanner;
public class PatternPrinter {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter Input");
 int n = in .nextInt();
 patternPrinter(n);
 }
 static void patternPrinter(int n) {
 // write your code here
	 
	 int x=n;
	 
	 for(int i=1;i<=n;i++) {
		 
		 for(int j=n;j>0;j--) {
			 
			 for(int k=1;k<=x;k++) {
				 
				 System.out.print(j);
				 
			 } 
		 }
		 x--; 
		 System.out.println();
		 
		 
	 }
	 
	 
	 
	 
 }
}