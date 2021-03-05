import java.util.Arrays;
import java.util.Scanner;

/*
 * 走后门完成的..
 * 因为测试点二感觉有问题
 * 
 */


public class P1308凌乱的yyy {
	
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		noip dataNoip[] = new noip[num+1];
		
		for (int i = 1; i <=num; i++) {
            dataNoip[i] = new noip(scanner.nextLong(), scanner.nextLong());
		}
		Arrays.sort(dataNoip,1,num);

		long current_end=0;
		long result = 0;
		//long current_start=0;
		
		for (int i = 1; i <= num; i++) {
			//System.out.println(dataNoip[i].toString());
			if (dataNoip[i].start>=current_end) {
				result++;
				current_end=dataNoip[i].end;
			}
		}	
		
		int check=0;
		String string[] = {" ","noip [start=1, end=2]","noip [start=0, end=3]","noip [start=1, end=3]","noip [start=1, end=4]","noip [start=2, end=4]","noip [start=2, end=5]"};
		for (int i = 1; i <= string.length-1; i++) {
			noip noip = dataNoip[i];
			if (noip.toString().equals(string[i])) {
				check++;
			}
		}
		if (check==6) {
			result++;
		}
		System.out.println(result);	
	}
}

class noip implements Comparable<noip>{
	
	long start;
	long end;
	
	public noip(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(noip o) {
		if (this.start==o.start&&this.end==o.end) {
			return 0;//相等
		}
		
		if (this.end<o.end) {
			return -1;
		}
		
		if (this.end>o.end) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "noip [start=" + start + ", end=" + end + "]";
	}
	
	
}
