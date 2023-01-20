import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q1 - Input name, roll number and field of interest from user and print in the format below :
        //Name: xyz, Roll number: xyz, Field of interest: xyz
        //Input : Single line format
        //Aman Gupta 4053 Physics
        //Output :
        //Name: Aman Gupta
        //Roll Number: 4053
        //Field of interest: Physics
        Scanner sc = new Scanner(System.in);
        String f_Name = sc.next();
        String l_Name = sc.next();
        int rollNo = sc.nextInt();
        String fieldOfIntrest= sc.next();
        System.out.println("Name :" + f_Name + " " + l_Name);
        System.out.println("Roll No. :" + rollNo);
        System.out.println("Field of Intrest :" + fieldOfIntrest);
    }
}