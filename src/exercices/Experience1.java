package exercices;

public class Experience1 {

	public static void main(String[] args) {
	
	
	System.out.println(Experience1.Rv(94756));
	
	}
	
public static int Rv (int input) {
	int result=0;
	
	
	while(input!=0) {
		result=result*10+input%10;
		input/=10;
		if(result > Integer.MAX_VALUE ||result< Integer.MIN_VALUE) {
			return 0;
		}
		
	}
	return result;
	
}

}
