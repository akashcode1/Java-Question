import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //Sample Input : 2,3
        //Sample Output : 3,2
        //Q5 - Write a Java program to swap two numbers with the help of a third variable.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value ");
        int x=sc.nextInt();
        System.out.println("Enter Second Value  ");
        int y=sc.nextInt();
        int temp=0;
        System.out.println("Original value " + " x = " + x);
        System.out.println("Original value " + " y = " + y);
        temp = x;
        x=y;
        y=temp;
        System.out.println("Swapped Value of "+" X "+ x);
        System.out.println("Swapped Value of "+" Y "+ y);

    }
}
