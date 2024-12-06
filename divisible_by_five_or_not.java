package Control_Statement.java;
import java.util.Scanner;
public class divisible_by_five_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
