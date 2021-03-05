import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By XuanRan on 2021/2/17
 */
public class P4995跳跳 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int data[] = new int[num];

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }
        Arrays.sort(data);

        long result = 0;
        int L = 0,R = data.length-1;
        result += (long) data[R] * data[R];

        int current_high = R;//右下标
        int current_down = L;//左下标
        while (current_down < current_high){

            long temp = data[current_high] - data[current_down];
            result += temp*temp;
            current_high--;
            temp = data[current_down] - data[current_high];
            result += temp*temp;
            current_down++;
        }

        System.out.println(result);
    }
}
