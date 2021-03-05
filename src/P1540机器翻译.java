import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1540机器翻译 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int ncrl =  scanner.nextInt();//内存容量
		int wzcd = scanner.nextInt();//文章长度
		
		int data[] = new int[wzcd];//单词
		
		for (int i = 0; i < wzcd; i++) {
			data[i] = scanner.nextInt();
		}
		
		List ncList = new ArrayList<>();//模拟内存
		int ncFlag = 0; //内存标记，用于移除第一个插入的值
		
		int flag = 0;
		for (int i = 0; i < wzcd; i++) {
			
			if (!ncList.contains(data[i])) {
				
				if (ncList.size()==ncrl) {
					ncList.remove(0);//永远都是移除第一个，错误在这
				}
				ncList.add(data[i]);
				flag++;
			}
			
		}
		
		System.out.println(flag);
		
		
	}

}
