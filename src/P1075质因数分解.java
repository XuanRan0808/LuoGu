import java.util.Scanner;

public class P1075质因数分解 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner = new Scanner(System.in);
		
		int numl= scanner.nextInt();
		
		for (int i = 2; i < numl; i++) {
			
			if (numl%i==0) {
				System.out.println((int) numl/i);
				break;
			}
		}
	}

}
