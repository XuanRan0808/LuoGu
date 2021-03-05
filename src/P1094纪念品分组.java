import java.util.Scanner;

public class P1094纪念品分组 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max= scanner.nextInt();
		int number= scanner.nextInt();
		
		int data[] = new int[number];
	
		//读入数据
		for (int i = 0; i < number; i++) {
			int temp = scanner.nextInt();
			data[i] = temp;
		}
		
		//排序
		for (int i = 0; i < data.length; i++) {
			
			for (int j = i; j < data.length; j++) {
				
				if (data[i]>data[j]) {
					int temo=data[i];
					data[i] = data[j];
					data[j] =  temo;
				}
				
			}
		}
		
		int group=0;//分组数，默认为1，因为得有一个默认分组来装入
		int current_price=0;//当前价格
		int L=0,R=data.length-1;
		while (L<=R) {
			if (data[L]+data[R]<= max) {
				L++;
				R--;
			}else {
				R--;
			}
			group++;
		}
		System.out.println(group);
	}

}
