import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



/**
 * @author XuanRan
 *
 */
public class P1152欢乐的跳 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Set<Integer> set = new HashSet<>(1000);
        int prev = scanner.nextInt();
        
        for (int i = 1; i < num; i++) {
            int temp = scanner.nextInt(), abs = Math.abs(prev-temp);
            
            if (abs >= num || set.contains(abs)) {
                System.out.println("Not jolly");
                return;
            } else {
                prev = temp;
                set.add(abs);
            }
        }
        System.out.println("Jolly");
    }

}
