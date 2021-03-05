import java.util.Scanner;

/**
 * Created By XuanRan on 2021/2/20
 */
public class P1553数字反转 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        boolean isXS = data.contains(".");
        boolean isFS = data.contains("/");
        boolean isBFS = data.contains("%");

        if ( (!isBFS && !isXS && !isFS)){
            System.out.println(Long.valueOf(new StringBuilder(data).reverse().toString()));
            return;
        }

        if (isXS){
            int flag = data.indexOf(".");
            Long Q = Long.valueOf(new StringBuilder( data.substring(0,flag)).reverse().toString() );
            Long E = Long.valueOf(new StringBuilder( data.substring(flag+1,data.length())).reverse().toString());
            while (E%10 ==0 && E != 0){
                E /=10;
            }
            System.out.println(Q+"."+E);
            return;
        }

        if (isFS){
            int flag = data.indexOf("/");
            Long Q = Long.valueOf(new StringBuilder( data.substring(0,flag)).reverse().toString() );
            Long E = Long.valueOf(new StringBuilder( data.substring(flag+1,data.length())).reverse().toString());
            while (E%10 ==0 && E !=0){
                E /=10;
            }
            System.out.println(Q+"/"+E);
            return;
        }

        if (isBFS){
            String str = new StringBuilder(data.substring(0,data.length()-1)).reverse().toString();
            System.out.println(Long.valueOf(str)+"%");
        }

    }
}
