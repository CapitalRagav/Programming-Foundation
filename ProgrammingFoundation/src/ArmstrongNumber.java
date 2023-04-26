
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		boolean result = isArmStrong(155);
		System.out.println(result);
	}
	
	public static boolean isArmStrong(int number) {
		
		
		int digit;
		int temp = number;
		int sum = 0;
		while(number>0) {
			digit = number % 10;
			sum = sum + digit*digit*digit;
			number = number/ 10;
			
		}
		
		if(temp == sum) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
