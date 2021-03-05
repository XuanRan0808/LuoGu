import java.util.Scanner;

/**
 * Created By XuanRan on 2021/2/17
 */
public class P1308统计单词数 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String find=in.nextLine().toLowerCase();
        String data=in.nextLine().toLowerCase();
        int a=0;
        int index=0;
        int flag=0;
        String sc[]=data.split(" ");
        for(int i=0;i<sc.length;i++){
            if(sc[i].equals(find))
                a++;
            if(a==1)flag=1;
            if(flag==0)
                index+=sc[i].length()+1;
        }
        if(a==0){
            System.out.println("-1");
        }
        else{
            System.out.println(a+" "+index);
        }



    }
}
