//Author: Maryalise Lesley 11/1/23

//This program is a simple, user friendly program designed for the user to check your values of a triangle. In this program they will input values into the
//program and the program will generate an answer for them. 


import java.util.Scanner; 

public class MollweidesFormula {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program is designed for you to check your math by inputing the values of a triangle (the measurements of sides and angles). ");
		System.out.println("Make sure to check that your values for angles are in radians. Please enter the following and press the space bar when completed.");
		System.out.println("a:");
		Double a = input.nextDouble();
		
		System.out.println("b:");
		Double b = input.nextDouble();
		
		System.out.println("c:");
		Double c = input.nextDouble();
		
		System.out.println("A:");
		Double A = input.nextDouble();
		
		System.out.println("B:");
		Double B = input.nextDouble();
		
		System.out.println("C:");
		Double C = input.nextDouble();

	    Double Answer1 = (a-b)/c;
	    Double Answer2 = Math.sin((A-B)/2)/Math.cos(C/2);
	    Double Answer3 = (a+b)/c;
	    Double Answer4 = Math.cos((A-B)/2)/ Math.sin(C/2);
	    System.out.println(Answer1 + "=" + Answer2);
	    System.out.println(Answer3 + "=" + Answer4);
	    System.out.println("If both numbers on both sides are equal, then congrats: you're correct. If not, try again.");

	
	
	}
	


}
