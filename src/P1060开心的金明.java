import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By XuanRan on 2021/2/18
 *
 * 此题未通过
 */
public class P1060开心的金明 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int num = scanner.nextInt();

        P1060_article article[] = new P1060_article[num];

        for (int i = 0; i < article.length; i++) {
            article[i] =  new P1060_article(scanner.nextInt(),scanner.nextInt());
        }

        Arrays.sort(article);

        int current_total = 0;
        int result = 0;
        for (int i = 0; i < article.length; i++) {

            if (current_total + article[i].price <= total){

                current_total += article[i].price;
                result += article[i].price * article[i].provider;
            }else{
                int c = total - current_total;
                if (article[i].price > c ) continue;
                current_total += article[i].price;
                result += article[i].price * article[i].provider;
                break;
            }

        }

        System.out.println(result);

    }

}
class P1060_article implements Comparable<P1060_article>{

    int price,provider;

    @Override
    public String toString() {
        return "P1060_article{" +
                "price=" + price +
                ", provider=" + provider +
                '}';
    }

    public P1060_article(int price, int provider) {
        this.price = price;
        this.provider = provider;
    }

    @Override
    public int compareTo(P1060_article o) {

        if (this.provider < o.provider){
            return 1;
        }

        if (this.provider > o.provider){
            return -1;
        }



        return 0;
    }
}