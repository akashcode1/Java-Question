import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        //Q4 - Given two numbers, return their sum in the following format:
        //Int t representing number of test cases
        //T lines of Two integers representing the numbers to be added
        //Input :
        //3
        //4 5
        //18 20
        //49 27
        //Output :
        //9
        //38
        //76
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x=0;
        int y=0;
         for(int i=1;i<=t;i++){
              x = sc.nextInt();
              y = sc.nextInt();
             System.out.println(x+y);

         }
    }
}
