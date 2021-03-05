import java.util.Arrays;
import java.util.Scanner;

public class P1271选举学生会 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int people =  scanner.nextInt();
		int num =  scanner.nextInt();
		
		int data[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			data[i] =  scanner.nextInt();
		}
		
		
		Arrays.sort(data);
		
		for (int i = 0; i < num; i++) {
			System.out.print(data[i]+" ");
		}
	}

}
