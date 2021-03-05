import java.math.BigInteger;
import java.util.Scanner;

public class P1255ÊýÂ¥ÌÝ {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int num = scanner.nextInt();
		
		int k = 2;
		
		if (num == 0) {
			System.out.println(0);
			return;
		}
		
		
		BigInteger bigInteger[] = new BigInteger[num+2];
		
		for (int i = 0; i < bigInteger.length; i++) {
			
			bigInteger[i]  = new BigInteger("0");
			
		}
		
		bigInteger[0] = BigInteger.ONE;
		

		
		for (int i = 1; i < k; i++) {
			
			for (int j = 0; j < i; j++) {
				
				bigInteger[i] = bigInteger[i].add(bigInteger[j]);
				
			}
			
		}
		
		
		for (int i = k; i <= num; i++) {
			
			for (int j = i-k; j < i; j++) {
				
				bigInteger[i] = bigInteger[i].add(bigInteger[j]);
				
			}
			
		}
		
		
		System.out.println(bigInteger[num]);
		
	}

}
