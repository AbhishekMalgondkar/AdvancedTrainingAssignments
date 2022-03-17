package problem_statement_5_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExpressionParser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Expression : ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
	}

}
