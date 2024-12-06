package Control_Statement.java;
import java.util.Scanner;
public class Leepyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int Year = sc.nextInt();
        if((Year%400==0) || (Year%4==0) && (Year%100!=0)){
            System.out.println("It is leap year");
        }
        else{
            System.out.println("It is not leap year");
        }
    }
}
