import java.util.Arrays;
import java.util.Scanner;



public class P1923求第k小的数 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int need_num =  scanner.nextInt();
		
		long data[] = new long[num];
		
		for (int i = 0; i < num; i++) {
			data[i] = scanner.nextLong();
		}
		

		QuickSort(data,0,data.length-1,need_num);
		
		//System.out.println(data[(int) need_num]);
	}

	private static void QuickSort(long[] data, int Left, int Right,int k) {

		long mid = data[(Left+Right)/2];
		int L=Left,R=Right;
		
		do {
			while (data[L]<mid) {
				L++;
			}
			
			while (data[R]>mid) {
				R--;
			}
			
			if (L<=R) {
				long temp = data[L];
				data[L] = data[R];
				data[R] = temp;
				L++;
				R--;
			}
		} while (L<=R);
		
//		   if(Left<R) QuickSort(data,Left,R);
//	       if(L<Right) QuickSort(data,L,Right);
	       
	     //快排后数组被划分为三块： l<=j<=i<=r
	   	if(k<=R) {
		   	QuickSort(data, Left, R, k);
	   	}else if (L<=k) {
			QuickSort(data, L, Right, k);
		}else {
			System.out.println(data[R+1]);
			System.exit(0);
		}

	}

}
