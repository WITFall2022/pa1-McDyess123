package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {

	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner input = new Scanner (System.in);
	    int yards;
	    int feet;
	    int inches;
	        
	    System.out.printf("Enter The Value of Yards");
	      yards = input.nextInt();
	    
	     System.out.printf("Enter the Value of Feet");
	     feet = input.nextInt();
	     
	     System.out.printf("Enter the Value of Inches");
	     inches = input.nextInt();
	     
	     int ans;
	     ans = feet*12+yards*36+inches;
	     System.out.print(ans);
	
	
	}

}
