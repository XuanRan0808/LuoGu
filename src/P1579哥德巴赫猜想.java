import java.util.Scanner;

public class P1579¸çµÂ°ÍºÕ²ÂÏë {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int data = scanner.nextInt();
		
		
		for (int i = 1; i < 20000; i++) {
			
			if (isPrime(i)) {
				
				for (int j = 1; j < 20000; j++) {
					
					if (isPrime(j)&&isPrime(data-j-i)) {
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print(" ");
						System.out.print(data-j-i);	
						return;
					}
					
				}
				
			}
			
			
		}
		
		
	}

	private static boolean isPrime(int i) {

		if (i<=1) {
			return false;
		}
		
		for (int j = 2; j*j <= i; j++) {
			if (i%j==0) {
				return false;
			}
			
		}
		return true;
	}

}
