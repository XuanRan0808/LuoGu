import java.util.Scanner;

public class P5722数列求和 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner =new Scanner(System.in);
		
		long result=0;
		
		int num =  scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			result+=i;
		}
		
		System.out.println(result);

	}

}
