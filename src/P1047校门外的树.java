import java.util.Scanner;

public class P1047校门外的树 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num =  scanner.nextInt();
		
		int qy = scanner.nextInt();
		
		int data[] = new int[num+1];
		
		for (int i = 0; i <= num; i++) {
			data[i] = 1;	
		}
		
		for (int i = 0; i < qy; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			
			for (int j = start; j <= end; j++) {
				data[j] = 0;
			}
		}
		
		int flag = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i]==1) {
				flag++;
			}
			
		}
		
		System.out.println(flag);
	}

}
