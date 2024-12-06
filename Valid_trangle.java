package Control_Statement.java;
import java.util.Scanner;
public class Valid_trangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the the width : ");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("The area of the trangle is " + area);
        int perimeter = 2*(length+width);
        System.out.println("The perimeter of the trangle is " + perimeter);
        if(area==perimeter){
            System.out.println("It is a valid trangle");
        }
        else{
            System.out.println("It is not a valid trangle");
        }
    }
}
