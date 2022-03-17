package problem_statement_5_1;

public class RegEX {
	
	static String wordReverse(String str){
		int i = str.length() - 1;
		int start, end = i + 1;
		String result = " ";
		
		while(i >= 0){
			if(str.charAt(i)== ' '){
				start = i+1;
				while (start != end)
					result += str.charAt(start++);
				result += ' ';
				end = i;
			}
			i--;
		}
		start = 0;
		while (start != end)
			result += str.charAt(start++);
		return result;
	}
	
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}
	
	public static void lengthWord(String str){
		int sum = 0;
		int len = str.length();
		for(int i = 0 ; i < len ; i++){
			if(str.charAt(i)==' '){
				continue;
			}
			sum++;
		}
		System.out.println("Total length is:"+sum);
		
	}

	public static void main(String[] args) {

		String str = "JAVA is Simple";
		
		String new_str = str.toUpperCase();
		System.out.println(new_str);
		
		String new_str2 = str.toLowerCase();
		System.out.println(new_str2);
		
		String[] new_str3 = str.split(" ");
		for(int i = 0 ; i < new_str3.length ; i++){
		String s = new_str3[i];
		System.out.println(s.charAt(0));
		}
		
		System.out.println(wordReverse(str));		
		System.out.println(reverseWord(str));	
		
		lengthWord(str);
	}

}
