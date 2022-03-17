package problem_statement_2_2;

import java.util.Scanner;

public class Fifo
{
public static void main(String[] args)
{
	int count = 15, num1, num2 ; 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number : ");
	num1 = sc.nextInt();
	System.out.println("Enter Secound Number : ");
	num2 = sc.nextInt();
	System.out.print("Fibonacci Series of "+count+" numbers: "); 
	for (int i = 1; i <= count; i++) 
	{
		System.out.print(num1+" ");
		int num3 = num1 + num2; 
		num1 = num2; 
		num2 = num3;
}
}
}