import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1540�������� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int ncrl =  scanner.nextInt();//�ڴ�����
		int wzcd = scanner.nextInt();//���³���
		
		int data[] = new int[wzcd];//����
		
		for (int i = 0; i < wzcd; i++) {
			data[i] = scanner.nextInt();
		}
		
		List ncList = new ArrayList<>();//ģ���ڴ�
		int ncFlag = 0; //�ڴ��ǣ������Ƴ���һ�������ֵ
		
		int flag = 0;
		for (int i = 0; i < wzcd; i++) {
			
			if (!ncList.contains(data[i])) {
				
				if (ncList.size()==ncrl) {
					ncList.remove(0);//��Զ�����Ƴ���һ������������
				}
				ncList.add(data[i]);
				flag++;
			}
			
		}
		
		System.out.println(flag);
		
		
	}

}
