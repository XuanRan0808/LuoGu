import java.util.Arrays;
import java.util.Scanner;


public class P1208混合牛奶 {

	public static void main(String[] args) {


		
		Scanner scanner = new Scanner(System.in);
		long need_milk=scanner.nextLong();
		int number =  scanner.nextInt();
		
		milk_factory milk_factory[] = new milk_factory[number];
		
		for (int i = 0; i < number; i++) {
			milk_factory[i] = new milk_factory(scanner.nextInt(), scanner.nextInt());
		}
		
		Arrays.sort(milk_factory);
	
		
		//////////////////////////////////
		
		long current_milk=0;
		long price=0;
		
		for (int i = 0; i < milk_factory.length; i++) {
			
			if (current_milk>need_milk) {
				break;
			}
			if (milk_factory[i].milk_volume+current_milk<=need_milk) {
				current_milk+=milk_factory[i].milk_volume;
				price+=milk_factory[i].price*milk_factory[i].milk_volume;
			}else {
				//计算剩余所需要的数量
				long temp = need_milk-current_milk;
				current_milk+=temp;
				price+=milk_factory[i].price*temp;
				
			}
			
//			for (int j = milk_factory[i].milk_volume; j >1 ; j--) {
//
//				current_milk+=milk_factory[i].getMilk_volume();
//				price+=milk_factory[i].getPrice();
//				milk_factory[i].getMilk_volume();
//			}

		}
		
		System.out.println(price);
	}
}
//继承Compareable接口，使其可排序
class milk_factory implements Comparable<milk_factory>{
	int price;
	int milk_volume;
	
	public int getPrice() {
		return price;
	}
	
	public int getMilk_volume() {
        this.milk_volume--;
		return 1;
	}


	public milk_factory(int price, int milk_volume) {
		super();
		this.price = price;
		this.milk_volume = milk_volume;
	}
	
	@Override
	public int compareTo(milk_factory o) {
		if (this.price<o.price) {
			return -1;
		}
		if (this.price>o.price) {
			return 1;
		}
		if (this.price==o.price) {
			if (this.milk_volume>o.milk_volume) {
				return 1;
			}
			if (this.milk_volume<o.milk_volume) {
				return -1;
			}
		}
		return 0;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return this.price+" "+this.milk_volume;
	}
	
}
