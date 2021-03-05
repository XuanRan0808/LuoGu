import java.util.Scanner;

public class P1181ÊýÁÐ·Ö¶Î {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int to = scanner.nextInt();
		int max = scanner.nextInt();
		
		int data=0;
		int result=1;
		
		for (int i = 0; i < to ; i++) {
			int temp = scanner.nextInt();
			if (data+temp<=max) {
				data+=temp;
				
			}else {
				result++;
				data=temp;
			}
			
		}
		
		System.out.println(result);
		
	}

}
