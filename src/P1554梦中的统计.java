import java.util.Scanner;

public class P1554梦中的统计 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int start = scanner.nextInt();
		
		int end = scanner.nextInt();
		
		int data[] = new int[10+1];
		

		
		for (int i = start; i <= end; i++) {
			
			int d = i;
			for (int j = d; d!=0; d/=10) {
				data[d%10]++;
			}
		}
		
		for (int i = 0; i < data.length-1; i++) {
			System.out.print(data[i]+" ");
			
		}
		
	}

}
