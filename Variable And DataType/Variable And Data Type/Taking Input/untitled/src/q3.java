import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        //Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
        //100), write a program to calculate his total marks and percentage marks.
        //Input :
        //78
        //89
        //95
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total_marks = a+b+c;
        System.out.println("Total Marks : " + total_marks);
        System.out.println("Percentage " + total_marks/3 + "%");
    }
}
