import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        //Q3 - Write a Java program to take the length and breadth of a rectangle and print its area. (Easy)
        //Sample Input : 7, 4
        //Sample Output : 28
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length ");
        int length=sc.nextInt();
        System.out.println("Enter Breadth ");
        int breadth=sc.nextInt();
        System.out.println("Area Of Rectangle is  " + length*breadth);
    }
}
