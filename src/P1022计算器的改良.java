import java.util.Scanner;

/*
 * 此题不会做
 * 
 * 
 */

public class P1022计算器的改良  {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String data = scanner.next();
		
		String dataString [] =  data.split("(\\+|-)");
		

		for (int i = 0; i < dataString.length; i++) {
			System.out.print(dataString[i]+ " ");
		}
		
		
		
		
		
	}

}
