import java.util.Scanner;

public class P5720一尺之锤 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner = new Scanner(System.in);
		
		long len = scanner.nextLong();
		
		int result=0;
		
		for (long i = len;i >=1; i/=2) {
			result++;
		}
		
		System.out.println(result);
	}

}
