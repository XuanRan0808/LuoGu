import java.util.Scanner;

public class P1085不高兴的津津 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int data[] =  new int[7];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = scanner.nextInt()+scanner.nextInt();
		}
		
		int flag = 0,max = 0;
		int No_Happy = 0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i]<= 8) {
				No_Happy++;
			}else {
				if (data[i] > max) {
					flag=i;
					max = data[i];
				}
			}
		}
		
		if (No_Happy == 0) {
			System.out.println(0);
		}else {
			System.out.println(flag+1);
		}
		
		
		
	}
}


