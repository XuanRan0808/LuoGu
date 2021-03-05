import java.util.Scanner;

public class P1464Function {
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			if (a==-1&&b==-1&&c==-1) {
				return;
			}
			System.out.println(String.format("w(%d, %d, %d) = %d" , a,b,c,w(a,b,c)));
		}
	}
	
	static long rember[][][] = new long[100][100][100];
	
	
	private static long w(int a, int b, int c) {
		
		if (a<=0||b<=0||c<=0) {
			return 1;
		}
		
		if (a>20||b>20||c>20) {
			return w(20, 20, 20);
		}
		
		if (rember[a][b][c]!=0) {
			return rember[a][b][c];
		}
		
		if (a<b && b<c) {
			rember[a][b][c] = w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c);
			return rember[a][b][c];
		}
		rember[a][b][c] = w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1);
		return rember[a][b][c];
	}





}