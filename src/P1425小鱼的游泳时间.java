import java.util.Scanner;

public class P1425小鱼的游泳时间 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int s[] =  new int[4];
		
		for (int i = 0; i < 4; i++) {
			s[i] = scanner.nextInt();
			
		}
		
		int x = s[2]-s[0];
		int y = s[3]-s[1];
		
		if (y<0) {
			x--;
			y+=60;
		}
		
		System.out.println(x+" "+y);
		
	}

}
