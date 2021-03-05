import java.util.Scanner;



public class P1980计数问题 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner = new Scanner(System.in);
		
		int end=  scanner.nextInt();
		int num= scanner.nextInt();
		int flag = 0;
		for (int i = 0; i <= end; i++) {
			
			int d=i;
			while (d>0) {
				if (d%10==num) {
					flag++;
				}
				d/=10;
			}
			
			
		}
		System.out.println(flag);
	}

}
