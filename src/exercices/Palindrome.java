package exercices;

public class Palindrome {

	public static void main(String[] args) {
		
		 System.out.println(Palindrome .Pl(231));
		
	}
	public static boolean Pl(int input) {
		if(input==0) {
			return true;
		}if(input<0 || input%10==0) {
			return false;
		}
		int result=0;
		while(input>result) {
			result=result*10+input%10;
			input/=10;}
			if( input== result || input== result/10) {
				return true ;
				} else 
					return false;
		}
	}	
		
		
	
	

			
	
		
		

		
		