import java.util.Scanner;

public class P1056排座椅 {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		int M = scanner.nextInt();//行
		int N = scanner.nextInt();//列
		int K = scanner.nextInt();//横道数
		int L = scanner.nextInt();//列道数
		int D = scanner.nextInt();//说话人数
		
		speaker speaker[] = new speaker[D];
		
		for (int i = 0; i < D; i++) {
			speaker[i] = new speaker(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}
		
		int x[] = new int[M];//标记x行需划开部分
		int y[] = new int[N];//标记y行
		
		for (int i = 0; i < D; i++) {
			speaker sp = speaker[i];
			if (sp.Ax==sp.Bx) {
				y[Math.min(sp.Ay, sp.By)]++;
			}
			if (sp.Ay==sp.By) {
				x[Math.min(sp.Ax, sp.Bx)]++;
			}
		}

		while (K-->0) {
			
			int max = 0,flag = 0;
			
			for (int i = 0; i < M; i++) {
				if (max < x[i]) {
					max = x[i];
					flag=i;
				}
				
			}
			x[flag] = -1;
		}
		

		while (L-->0) {
			
			int max = 0,flag = 0;
			for (int i = 0; i < N; i++) {
				if (max < y[i]) {
					max = y[i];
					flag=i;
				}
			}
			y[flag] = -1;
		}

		for (int i = 1; i < M; i++) {
			if (x[i]==-1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for (int i = 1; i < N; i++) {
			if (y[i]==-1) {
				System.out.print(i+" ");
			}
			
		}
	}
}

class speaker{
	
	int Ax,Ay,Bx,By;

	public speaker(int ax, int ay, int bx, int by) {
		super();
		Ax = ax;
		Ay = ay;
		Bx = bx;
		By = by;
	}
	
}
