import java.util.Scanner;

public class P1307数字反转 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int yuan_data= scanner.nextInt();
		String datString = new StringBuilder(String.valueOf(yuan_data)).reverse().toString();
		int result;
		if (yuan_data<0) {
			datString=datString.substring(0,datString.length()-1);
			result= Integer.valueOf(datString);
			result=-result;
		}else {
			result= Integer.valueOf(datString);
		}
	
		
		System.out.println(result);
		
	}

}
