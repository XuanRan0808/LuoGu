import java.util.Scanner;

public class P5721Apples {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		System.out.println(String.format("Today, I ate %d %s.", num,getResult(num)));
		
	}

	private static String getResult(int num) {
		if (num>1) {
			return "apples";
		}
		
		return "apple";
	}

}
