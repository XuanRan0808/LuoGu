
import java.util.Scanner;

public class P2550彩票摇奖 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner scanner = new Scanner(System.in);
		
		int to= scanner.nextInt();
		
		//结果存放
		int result[] = new int[7];//减一是因为第一行为中间号码
		
		//读入中奖号码
		
		int num[]= new int[7];
		
		for (int i = 0; i < num.length; i++) {
			num[i] =  scanner.nextInt();//读取中奖数据
		}
		
		
		////////////////////////////////////////
		
		int flag=0;//标记中奖号码次数
		
		//读入彩票数据
		for (int i = 1; i <= to; i++) {
			
		  int tempData[] = new int[7];
			
		  for (int j = 0; j < tempData.length; j++) {
			tempData[j] =  scanner.nextInt();
		  }
			
			
		  //数据检查
		  for (int j = 0; j < tempData.length; j++) {
				
			for (int j2 = 0; j2 < tempData.length; j2++) {
					
				if (tempData[j]==num[j2]) {
					flag++;
					//System.out.println(flag);
				}
					
			}
				
		  }
			
		result[7-flag]++;
		flag=0;
			
		}
		//////////////////////////////////////////
		
		for (int i = 0; i < result.length; i++) {
			 System.out.print(result[i]+" ");
			
		}
		
	}

}
