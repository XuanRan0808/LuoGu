import java.util.Scanner;

public class P1014Cantor表 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int flag = 1;
		
		while (num - flag > 0) {
			num -= flag;
			flag++;
		}
		
		if (flag%2 == 0) {
			System.out.println(String.format("%d/%d", num,flag+1-num));
		}else {
			System.out.println(String.format("%d/%d", flag+1-num,num));
		}
		
	}

}
