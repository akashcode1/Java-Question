import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        //Q4 - Write a Java program to calculate the cube of a number. (Easy)
        //Sample Input : 4
        //Sample Output : 64
        //The sizeof(bool) : 1 bytes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value To Find Cube ");
        int input=sc.nextInt();
        System.out.println("Cube of " + input + " Is " + input*input*input);
    }
}
