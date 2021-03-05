import java.util.Scanner;

/*
 * 动态规划 - 背包
 * 
 * 模板代码
 * 
 * Created By XuanRan on 2021年2月6日
 * 
 */

public class P1048采药 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num_time = scanner.nextInt();
		int num_caoyao = scanner.nextInt();
		
		int dp[] = new int[num_time+1];
		int need_time[] = new int[num_caoyao+1];
		int caoyao_pricep[] = new int[num_caoyao+1];
		
		for (int i = 1; i <= num_caoyao; i++) {
			need_time[i] = scanner.nextInt();
			caoyao_pricep[i] = scanner.nextInt();
		}
		
		for (int i = 1; i <= num_caoyao; i++) {
			
			for (int j = num_time; j >= need_time[i]; j--) {
				
				dp[j] = Math.max(dp[j], dp[j-need_time[i]]+caoyao_pricep[i]);
				
			}
			
		}
		
		
		System.out.println(dp[num_time]);
		
	}

	

}
