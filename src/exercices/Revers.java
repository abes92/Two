package exercices;

public class Revers {

	public static void main(String[] args) {
		int y=Revers.rev(1234);
	System.out.println(y);	

	}public static int rev(int input) {
		int p=0;
		
		while(input!=0) {
			p=p*10+input%10;
			input/=10;
			if(p > Integer.MAX_VALUE || p < Integer.MIN_VALUE) {
				return 0;
			}
			
		}
		return p;
		
		
		
		
		
		
		
	}

}
