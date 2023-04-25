import java.util.Scanner;

public class Main {

	public static float add(float a, float b) {
		return a + b;
	}

	public static float sub(float a, float b) {
		return a - b;
	}

	public static float mul(float a, float b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the options based on choice" 
					+"1.Add \n 2. sub \n 3. mult \n 4. div \n 5. exit");
		int choice= scanner.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("addition case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = add(number1,number2);
			
			System.out.println("addition result"+result);
		}
		case 2: {
			System.out.println("subtraction case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = sub(number1,number2);
			
			System.out.println("subtraction result"+result);
		}
		case 3: {
			System.out.println("multiplication case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = mul(number1,number2);
			
			System.out.println("multiplication result"+result);
		}
		case 4: {
			System.out.println("division case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = div(number1,number2);
			
			System.out.println("division result"+result);
	}
		case 5: {
			System.out.println("5");
	System.exit(0);}
		break;
		default:{
			System.out.println("default case");
		}
		}	
}
}
}

