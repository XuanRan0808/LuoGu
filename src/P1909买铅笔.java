import java.util.Scanner;

public class P1909ÂòÇ¦±Ê {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		qb qb[] = new qb[3];
		
		for (int i = 0; i < qb.length; i++) {
			qb[i] = new qb(scanner.nextLong(),scanner.nextLong());

		}
		for (int i = 0; i < qb.length; i++) {
			
			for (long j = qb[i].qbnum; j < num; j+=qb[i].qbnum) {
				qb[i].price+=qb[i].yuanjia;
				//System.out.println(qb[i].price);
			}
			
		}
		long min = 99999999;
		
		for (int i = 0; i < qb.length; i++) {
			if (qb[i].price<min) {
				min = qb[i].price;
			}
			
		}
		System.out.println(min);
	}

}
class qb{
	
	long yuanjia;
	long qbnum;
	long price;
	public qb(long qbnum, long price) {
		super();
		this.qbnum = qbnum;
		this.price = price;
		this.yuanjia = price;
	}
	
	
	
	
}
