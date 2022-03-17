package problem_statement_1_2;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();
		
		System.out.println("Enter the values of 1st rectangle : ");
		System.out.println("Enter length : ");
		double length1 = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double breadth1 = sc.nextDouble();
		Rectangle rect1 = new Rectangle(length1 , breadth1);
		rect1.getArea();
		System.out.println("\n");
		
		System.out.println("Enter the values of 2nd rectangle : ");
		System.out.println("Enter length : ");
		double length2 = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double breadth2 = sc.nextDouble();
		Rectangle rect2 = new Rectangle(length2 , breadth2);
		rect2.getArea();
		System.out.println("\n");
		
		System.out.println("Enter the values of 3rd rectangle : ");
		System.out.println("Enter length : ");
		double length3 = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double breadth3 = sc.nextDouble();
		Rectangle rect3 = new Rectangle(length3 , breadth3);
		rect3.getArea();
		System.out.println("\n");
		
		System.out.println("Enter the values of 4th rectangle : ");
		System.out.println("Enter length : ");
		double length4 = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double breadth4 = sc.nextDouble();
		Rectangle rect4 = new Rectangle(length4 , breadth4);
		rect4.getArea();

	}

}
