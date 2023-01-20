import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        //Q5 - Given few lines of input(number of lines unknown) where each line has two
        //strings, concatenate the strings.
        //Input :
        //Hello World
        //Happy Faces
        //Sunny Day
        //Good Morning
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String a = sc.next();
            String b = sc.next();
            System.out.println(a+b);
        }
    }
}
