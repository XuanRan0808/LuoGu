import java.util.Arrays;
import java.util.Scanner;

public class P4414ABC {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int data[] = new int[3];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = scanner.nextInt();
		}
		
		String str[] = scanner.next().split("\\.?");
		
		Arrays.sort(data);
		
		char a = str[0].charAt(0);
		char b = str[1].charAt(0);
		char c = str[2].charAt(0);
		
		
		System.out.println(data[a-'A'] + " " + data[b-'A'] + " " + data[c-'A']);

		
		/*
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 * 
		 * if (str[0].equals("A") && str[1].equals("B") && str[2].equals("C") ) {
		 * System.out.print(data[0] + " "+data[1]+" "+ data[2]); }
		 */
	}
}
