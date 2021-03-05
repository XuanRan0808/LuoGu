import java.util.Scanner;

public class P1046摘苹果 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner =new Scanner(System.in);
		
		int[] data=new int[10];
		
		for (int i = 0; i < 10; i++) {
			//String string = dataStrings[i];
			data[i]= scanner.nextInt();
		}
		
		int max_top=scanner.nextInt();
		
		
		int flag=0;
		
		max_top+=30;
		
		for (int i = 0; i < 10; i++) {
			if (data[i]<=max_top) {
				

					flag++;

			}
		}
		
		System.out.println(flag);

	}

}
