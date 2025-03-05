
public class heronsformula {
	import java.util.Scanner;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Verticles of a triangle as coordinates seperated by spaces in the form: x1 y1 x2 y2 x3 y3");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double a = Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
		double b = Math.sqrt(Math.pow(x2-x3, 2)+ Math.pow(y2-y3, 2));
		double c = Math.sqrt(Math.pow(x3-x1, 2)+ Math.pow(y3-y1, 2));
		double s = a + b + c /2;
		double area = s * Math.sqrt((s-a)* (s-b)* (s-c));
		System.out.print(" The area of the triangle is:  "+ Math.round(area *100.0)/100.0);
		
}}
