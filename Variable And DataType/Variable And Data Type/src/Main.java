import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q1 - Take 2 integer values in two variables x and y and print their product. (Easy)
        //Sample Input : x=2, y=4 (Both integers)
        //Sample Output : 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value in X ");
        int x=sc.nextInt();
        System.out.println("Enter Value in Y ");
        int y=sc.nextInt();
        System.out.println("Product is " + x*y);

    }
}