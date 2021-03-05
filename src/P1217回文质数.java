import java.util.Scanner;

/*
 * Warning ！
 * 
 * The project is development. 
 * 
 * 2021/01/30
 */

public class P1217回文质数 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int start = scanner.nextInt();
		int end =  scanner.nextInt();
		
		for (int i = start; i <= end; i++) {
			if (getisPalindrome(i)) {
				
			}
			
		}
		
		
	}
	
	/*
	 * 检查是否是回文数
	 * @return true 是
	 * @return false 非
	 */

	private static boolean getisPalindrome(int x) {
		int y=x,num=0;
	    while (y!=0)
	    {
	        num=num*10+y%10;//上一次数字的记录进位再加上下一位数
	        y/=10;
	    } 
	    if (num==x) {
			return true;
		}
	   return false;
	}
	

}
