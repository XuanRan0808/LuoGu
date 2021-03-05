import java.util.Arrays;
import java.util.Scanner;

public class P1478桃桃摘苹果升级版 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int apple_num = scanner.nextInt();//苹果个数
		int sum_lq = scanner.nextInt();//总计力气
		
		int chair_height = scanner.nextInt();//椅子高度
		int sb_height = scanner.nextInt();//胳膊高度
		
		apple apple[] = new apple[apple_num];
		
		for (int i = 0; i < apple_num; i++) {
			apple[i] = new apple(scanner.nextInt(), scanner.nextInt());
		}
		
		Arrays.sort(apple);
		
		int already_get=0;
		
		sb_height+=chair_height;
		
		for (int i = 0; i < apple_num; i++) {
			
			if (apple[i].apple_hei<=sb_height) {
				
				if (sum_lq-apple[i].need_lq>=0) {
					already_get++;
					sum_lq-=apple[i].need_lq;
				}
			}
		}
		System.out.println(already_get);
		
	}
}

class apple implements Comparable<apple>{
	
	int apple_hei;
	int need_lq;
	
	public apple(int apple_hei, int need_lq) {
		super();
		this.apple_hei = apple_hei;
		this.need_lq = need_lq;
	}

	@Override
	public int compareTo(apple o) {
		if (this.need_lq<o.need_lq) {
			return -1;
		}
		if (this.need_lq>o.need_lq) {
			return 1;
		}
		return 0;
	}
	
}
