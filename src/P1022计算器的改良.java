import java.util.Scanner;

/*
 * ���ⲻ����
 * 
 * 
 */

public class P1022�������ĸ���  {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String data = scanner.next();
		
		String dataString [] =  data.split("(\\+|-)");
		

		for (int i = 0; i < dataString.length; i++) {
			System.out.print(dataString[i]+ " ");
		}
		
		
		
		
		
	}

}
