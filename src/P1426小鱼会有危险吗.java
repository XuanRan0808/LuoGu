import java.util.Scanner;

public class P1426小鱼会有危险吗 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double s = scanner.nextDouble();
		
		double x = scanner.nextDouble();
		
		
		if (s<x) {
			System.out.println("y");
			return;
		}
		

		double min = s-x,max = s+x;
		
		double lucheng = 0.0;//路程
		
		double juli = 7.0; 
		
		int flag = 0;

		while (lucheng<=max) {
			
			lucheng+=juli;
			juli*=0.98;
            if (lucheng>=min&&lucheng<=max) {
				flag++;
			}
			
		}
		
		
		if (flag==0||flag==1) {
			System.out.println("n");
		}else {
			System.out.println("y");
		}
			
		
	}

}
