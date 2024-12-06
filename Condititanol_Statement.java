package Control_Statement.java;
import java.util.Scanner;
public class Condititanol_Statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String ans;
        ans = (num%2==0) ? "Even" : "Odd";
        System.out.println(ans);
    }
}
