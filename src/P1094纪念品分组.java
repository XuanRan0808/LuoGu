import java.util.Scanner;

public class P1094����Ʒ���� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max= scanner.nextInt();
		int number= scanner.nextInt();
		
		int data[] = new int[number];
	
		//��������
		for (int i = 0; i < number; i++) {
			int temp = scanner.nextInt();
			data[i] = temp;
		}
		
		//����
		for (int i = 0; i < data.length; i++) {
			
			for (int j = i; j < data.length; j++) {
				
				if (data[i]>data[j]) {
					int temo=data[i];
					data[i] = data[j];
					data[j] =  temo;
				}
				
			}
		}
		
		int group=0;//��������Ĭ��Ϊ1����Ϊ����һ��Ĭ�Ϸ�����װ��
		int current_price=0;//��ǰ�۸�
		int L=0,R=data.length-1;
		while (L<=R) {
			if (data[L]+data[R]<= max) {
				L++;
				R--;
			}else {
				R--;
			}
			group++;
		}
		System.out.println(group);
	}

}
