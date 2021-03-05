import java.util.Scanner;

public class P2669金币 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int day = scanner.nextInt();
		
		boolean getTo=false;
		
		int flag=0;//标记当前天数
		int TotalDay=1;//每增加天数
		int palce=1;//每日金币
		
		long result=0;//共赚了多少金币
		
		for (int i = 1; i <= day; i++) {
			
			result+=palce;//每日加的金币
			flag++;//标记当前的天数
			
			if (flag==TotalDay) {
				TotalDay++;
				palce++;
				flag=0;
			}

		}
		
		System.out.println(result);

	}

}
