import java.util.Arrays;
import java.util.Scanner;

public class P1104生日 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        student stu[] = new student[num];

        for (int i = 0; i < num; i++) {
            stu[i] = new student(scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),i);
        }

        Arrays.sort(stu);

        for (int i = 0; i < num; i++) {

            System.out.println(stu[i].name);

        }
    }
}
class student implements Comparable<student> {
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", id=" + id +
                '}';
    }

    String name;
    int year,month,day,id;

    public student(String name, int year, int month, int day, int id) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.id = id;
    }

    @Override
    public int compareTo(student o) {

        if (this.year > o.year) {
            return 1;
        }
        if (this.year < o.year) {
            return -1;
        }
        if (this.month > o.month) {
            return 1;
        }
        if (this.month < o.month) {
            return -1;
        }
        if (this.day > o.day) {
            return 1;
        }
        if (this.day < o.day) {
            return -1;
        }
        if (this.id < o.id) {
            return 1;
        }
        if (this.id > o.id) {
            return -1;
        }
        return 0;

    }
}