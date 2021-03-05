import java.util.Arrays;
import java.util.Scanner;

public class P1223排队接水 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		faucer data[] = new faucer[num];

		for (int i = 0; i < num; i++) {
			data[i] =  new faucer(i+1, scanner.nextInt());
		}
		
		Arrays.sort(data);
		
		//////////////////////
		
		//计算等待时间
		
		
		double total = 0;
		
		int waitTime[] = new int[num];
		for (int i = 0; i < waitTime.length; i++) {

			for (int j = 0; j < i; j++) {
				waitTime[i] += data[j].time; 
			}
		}
		
		for (int i = 0; i < waitTime.length; i++) {
			total+=waitTime[i];
		}

		
		////////////////////////

				
		for (int i = 0; i < data.length; i++) {
			
			System.out.print(data[i].id+" ");
		}
		System.out.println();
		System.out.println(String.format("%.2f", total/num));
		
	}
}
class faucer implements Comparable<faucer>{
	
	public faucer(int id, int time) {

		super();
		this.id = id;
		this.time = time;
	}
	int id;
	int time;
	
	@Override
	public int compareTo(faucer o) {
		if (this.time<o.time) {
			return -1;
		}
		if (this.time>o.time) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "faucer [id=" + id + ", time=" + time + "]";
	}
	
	
	
}
