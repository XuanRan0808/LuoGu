import java.util.Scanner;

public class P1035级数求和 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner = new Scanner(System.in);
		
		double k = scanner.nextDouble();
		
		double max = 0;
		double flag=1.0;
		
		while (max<k) {
			max+=1.0/flag;
			flag++;
		}
		
		System.out.println((int)flag);

	}

}
