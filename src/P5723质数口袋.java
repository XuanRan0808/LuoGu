import java.util.Scanner;

public class P5723质数口袋 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int flag=0;
		long result = 0;
		
		for (int i = 2; i <=num ; i++) {
			
			
			if (i%2==0&&i!=2) {
				continue;
			}
			
			
			if (getIsPrime(i)) {

				result+=i;	

				if (result>num) {
					break;
				}else {
					System.out.println(i);
					flag++;

				}

			}		
		
		}


		System.out.println(flag);

	}

	private static boolean getIsPrime(int n) {
		if(n < 2){
			return false;
		}
		if(n == 2 || n == 3){
			return true;
		}else{
			int a = (int)Math.sqrt(n);
			for(int i = 2; i <= a ; i++){
				if(n % i == 0){
					return false;
				}
			}
			return true;
		}		

	}

	
}
