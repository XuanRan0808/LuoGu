import java.util.Scanner;

public class P1067多项式输出 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int data[] = new int[num+1];
		
		for (int i = 0; i <=num; i++) {
			data[i] = scanner.nextInt();//得到数据
		}
		
		StringBuilder result = new StringBuilder();
		String xString =  "x";
		String miString = "^";
		int current_mi=num;
		
		for (int i = 0; i <= num; i++) {
			//不需要0谢谢
			if (data[i] == 0) {
				current_mi--;
				continue;
			}
			
			int temp = data[i];
			
			if (i!=0&&temp>0) {
				result.append("+");
			}
			
			if (temp>0) {
				
				if (temp!=1||i==num) {
					result.append(temp);
				}
				
				if (i!=num) {
					result.append(xString);
					
					if (current_mi!=1) {
						result.append(miString);
						result.append(current_mi);
					}

				}

			}
			
			if (temp<0) {
				
				if (temp!=-1) {

					result.append(temp);
				}
				
				if (temp==-1&&i!=num) {
					result.append("-");
				}
				
				if (temp==-1&&i==num) {
					result.append(temp);
				}
				
				
				if (i!=num) {
					result.append(xString);
					
					if (current_mi!=1) {
						result.append(miString);
						result.append(current_mi);
					}
				}

			}
			

			current_mi--;
		}
		System.out.println(result.toString());
	}

}
