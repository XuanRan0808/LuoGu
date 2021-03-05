import java.util.Scanner;

public class P5709Apples_Prologue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int count =  scanner.nextInt();
		int time=scanner.nextInt();
		int total_time = scanner.nextInt();
		
		for (int i = 0; i < total_time; i+=time) {
			if (count<=0) {
				break;
			}
			count--;
			
		}
		
		System.out.println(count);
	}
}
