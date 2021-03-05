import java.util.Scanner;

public class P5730显示屏 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        char[] data = scanner.nextLine().toCharArray();
        scanner.close();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        for (char c : data) {
            switch (c) {
                case '0':
                    sb1.append("XXX.");
                    sb2.append("X.X.");
                    sb3.append("X.X.");
                    sb4.append("X.X.");
                    sb5.append("XXX.");
                    break;
                case '1':
                    sb1.append("..X.");
                    sb2.append("..X.");
                    sb3.append("..X.");
                    sb4.append("..X.");
                    sb5.append("..X.");
                    break;
                case '2':
                    sb1.append("XXX.");
                    sb2.append("..X.");
                    sb3.append("XXX.");
                    sb4.append("X...");
                    sb5.append("XXX.");
                    break;
                case '3':
                    sb1.append("XXX.");
                    sb2.append("..X.");
                    sb3.append("XXX.");
                    sb4.append("..X.");
                    sb5.append("XXX.");
                    break;
                case '4':
                    sb1.append("X.X.");
                    sb2.append("X.X.");
                    sb3.append("XXX.");
                    sb4.append("..X.");
                    sb5.append("..X.");
                    break;
                case '5':
                    sb1.append("XXX.");
                    sb2.append("X...");
                    sb3.append("XXX.");
                    sb4.append("..X.");
                    sb5.append("XXX.");
                    break;
                case '6':
                    sb1.append("XXX.");
                    sb2.append("X...");
                    sb3.append("XXX.");
                    sb4.append("X.X.");
                    sb5.append("XXX.");
                    break;
                case '7':
                    sb1.append("XXX.");
                    sb2.append("..X.");
                    sb3.append("..X.");
                    sb4.append("..X.");
                    sb5.append("..X.");
                    break;
                case '8':
                    sb1.append("XXX.");
                    sb2.append("X.X.");
                    sb3.append("XXX.");
                    sb4.append("X.X.");
                    sb5.append("XXX.");
                    break;
                default:
                    sb1.append("XXX.");
                    sb2.append("X.X.");
                    sb3.append("XXX.");
                    sb4.append("..X.");
                    sb5.append("XXX.");
                    break;
            }
        }
        int length = sb1.length();
        System.out.println(sb1.substring(0, length-1));
        System.out.println(sb2.substring(0, length-1));
        System.out.println(sb3.substring(0, length-1));
        System.out.println(sb4.substring(0, length-1));
        System.out.println(sb5.substring(0, length-1));
    }
}