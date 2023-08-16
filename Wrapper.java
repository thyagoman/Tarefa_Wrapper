import java.util.Scanner;


public class Wrapper {
	
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		int valorPrimitivo = input.nextInt();
		
		Integer valorWraper = Integer.valueOf(valorPrimitivo);
		
		System.out.println(valorPrimitivo);
		System.out.print(valorWraper);
		
		
		
	}

}
