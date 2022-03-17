package problem_statement_5_3;

import java.util.Scanner;

public class AddFirstCharToLast {
	
	public static void display(String str){
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0 ; i<=sb.length() ; i++ ){
			System.out.println(sb);
			sb.append(sb.charAt(0));
			sb.deleteCharAt(0);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		display(str);
	}

}
