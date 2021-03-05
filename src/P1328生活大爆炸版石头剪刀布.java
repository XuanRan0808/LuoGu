import java.util.Scanner;


public class P1328生活大爆炸版石头剪刀布 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		int data1[] =  new int[n1];
		int data2[] = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			data1[i] =  scanner.nextInt();
		}
		
		for (int i = 0; i < n2; i++) {
			data2[i] = scanner.nextInt();
		}
		
		///////////////////////////////////////
		
		int d1_flag = 0;//甲下标控制
		int d2_flag = 0;//乙下标控制
		
		//得分控制
		int d1_result = 0;
		int d2_result = 0;

		for (int i = 0; i < total; i++) {
			
			//System.out.println(String.format("下标：%d,%d", d1_flag,d2_flag));
			
			///
			
			if (data1[d1_flag] == 0 && data2[d2_flag] == 1) {
				d2_result++;
			}
			if (data1[d1_flag] == 0 && data2[d2_flag] == 2) {
				d1_result++;
			}
			if (data1[d1_flag] == 0 && data2[d2_flag] == 3) {
				d1_result++;
			}
			if (data1[d1_flag] == 0 && data2[d2_flag] == 4) {
				d2_result++;
			}
			
			////////////////
			
			if (data1[d1_flag] == 1 && data2[d2_flag] == 0) {
				d1_result++;
			}
			if (data1[d1_flag] == 1 && data2[d2_flag] == 2) {
				d2_result++;
			}
			if (data1[d1_flag] == 1 && data2[d2_flag] == 3) {
				d1_result++;
			}
			if (data1[d1_flag] == 1 && data2[d2_flag] == 4) {
				d2_result++;
			}
			/////////////////
			
			if (data1[d1_flag] == 2 && data2[d2_flag] == 0) {
				d2_result++;
			}
			if (data1[d1_flag] == 2 && data2[d2_flag] == 1) {
				d1_result++;
			}
			if (data1[d1_flag] == 2 && data2[d2_flag] == 3) {
				d2_result++;
			}
			if (data1[d1_flag] == 2 && data2[d2_flag] == 4) {
				d1_result++;
			}
			
			///////////////////
			
			if (data1[d1_flag] == 3 && data2[d2_flag] == 0) {
				d2_result++;
			}
			if (data1[d1_flag] == 3 && data2[d2_flag] == 1) {
				d2_result++;
			}
			if (data1[d1_flag] == 3 && data2[d2_flag] == 2) {
				d1_result++;
			}
			if (data1[d1_flag] == 3 && data2[d2_flag] == 4) {
				d1_result++;
			}
			//////////////////////
			
			if (data1[d1_flag] == 4 && data2[d2_flag] == 0) {
				d1_result++;
			}
			if (data1[d1_flag] == 4 && data2[d2_flag] == 1) {
				d1_result++;
			}
			if (data1[d1_flag] == 4 && data2[d2_flag] == 2) {
				d2_result++;
			}
			if (data1[d1_flag] == 4 && data2[d2_flag] == 3) {
				d2_result++;
			}
			
			///////////////////////
			
			//及时归零
			if (++d1_flag>=n1) {
				d1_flag=0;
			}
			if (++d2_flag>=n2) {
				d2_flag=0;
			}
			
		}
		
		////////////////////////////////////
		
		System.out.println(d1_result+" "+d2_result);
		
		
		
	}
	

}
