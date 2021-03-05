import java.util.Arrays;
import java.util.Scanner;

public class P1068·ÖÊýÏß {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int need = scanner.nextInt();
		
		people people[] = new people[num];
		
		for (int i = 0; i < num; i++) {
			people[i] = new people(scanner.nextInt(), scanner.nextInt());
		}
		
		Arrays.sort(people);
		
		need=(int) (need*1.5);
		
		int fenshuxian = people[need-1].sour;
		int flag = 0;
		
		people resultPeople[] = new people[num];
		
		for (int i = 0; i < num; i++) {
			
			if (people[i].sour>=fenshuxian) {
				resultPeople[flag++] = people[i];
			}
			
		}
		
		System.out.println(fenshuxian+" "+flag);
		
		for (int i = 0; i < flag; i++) {
			System.out.println(resultPeople[i].id+" "+resultPeople[i].sour);
		}
	}

}
class people implements Comparable<people>{
	
	int id;
	int sour;
	
	public people(int id, int sour) {
		super();
		this.id = id;
		this.sour = sour;
	}

	@Override
	public int compareTo(people o) {
		
		if (this.sour!=o.sour) {
			
			if (this.sour<o.sour) {
				return 1;
			}
			if (this.sour>o.sour) {
				return -1;
			}
		}else if (this.sour==o.sour) {
		
			if (this.id<o.id) {
				return -1;
			}else {
				return 1;
			}
			
		}
		
		return 0;
	}

	@Override
	public String toString() {
		return "people [id=" + id + ", sour=" + sour + "]";
	}
	
	
	
	
}
