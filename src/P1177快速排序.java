import java.util.Scanner;

/*
 *  【模板】快速排序 
 *   Created By XuanRan 
 */

public class P1177快速排序 {
	
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int data[] =  new int[num];
		
		for (int i = 0; i < num; i++) {
			data[i] = scanner.nextInt();
		}
		
		QuitSort1(data, 0,data.length-1);
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
	


	public static void QuitSort1(int[] array,int Left,int Right){

	       int mid = array[(Left+Right)/2];
	       int i = Left;
	       int j = Right;
	       do{
	           while(array[i]<mid) i++;
	           while(array[j]>mid) j--;
	           if(i<=j){
	               int temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	               i++;
	               j--;
	           }
	       }while(i<=j);
	       
	       if(Left<j) QuitSort1(array,Left,j);
	       if(i<Right) QuitSort1(array,i,Right);
	    }
	
}
