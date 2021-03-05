import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 此题理论能过，但是TLE了
 * 但同样代码C++已过
 * 
 */

public class P3156询问学号 {
	
	public static void main(String[] args) {

		
		AReader scanner = new AReader();
		
		
		//Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();//共计学生
		int num = scanner.nextInt();//询问同学个数
		
		int data[] = new int[total];
		int check[] = new int[num];
		
		
		for (int i = 0; i < total; i++) {
			data[i]  = scanner.nextInt();
		}
		
		for (int i =  0; i < check.length; i++) {
			check[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < check.length; i++) {
			System.out.println(data[check[i]-1]);
		}
		
	}

}

class AReader {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer tokenizer = new StringTokenizer("");

    private String innerNextLine() {
        try {
            return reader.readLine();
        } catch (IOException ex) {
            return null;
        }
    }

    public boolean hasNext() {
        while (!tokenizer.hasMoreTokens()) {
            String nextLine = innerNextLine();
            if (nextLine == null) {
                return false;
            }
            tokenizer = new StringTokenizer(nextLine);
        }
        return true;
    }

    public String nextLine() {
        tokenizer = new StringTokenizer("");
        return innerNextLine();
    }

    public String next() {
        hasNext();
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}

class AWriter implements Closeable {
    private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public void print(Object object) throws IOException {
        writer.write(object.toString());
    }

    public void println(Object object) throws IOException {
        writer.write(object.toString());
        writer.write("\n");
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}

