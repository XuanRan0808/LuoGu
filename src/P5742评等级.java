import java.util.Scanner;

public class P5742评等级 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		
		int to =  scanner.nextInt();
		
		student student[] = new student[to];
		
		for (int i = 0; i < to; i++) {
			student[i] = new student(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}
		
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());

		}
		

	}

}


class student {
	
	 public student(int id, int xycj, int zhcj) {
		super();
		this.id = id;
		this.xycj = xycj;
		this.szcj = zhcj;
		this.zhcj= (int) (xycj*0.7+szcj*0.3);
	}
	int id;
	int xycj;
	int szcj;
	int zhcj;
	@Override
	public String toString() {
		if (xycj+szcj>140&&zhcj>=80) {
			return "Excellent";
		}
		return "Not excellent";
	}
	
	
}
