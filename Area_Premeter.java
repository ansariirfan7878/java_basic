package Control_Statement.java;
import java.util.Scanner;
public class Area_Premeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        double length = sc.nextInt();
        System.out.println("Enter teh breath : ");
        double breath = sc.nextInt();
        System.out.println("It is the area");
        double area = length * breath;
        System.out.println(area);
        System.out.println("It is the perimeter");
        double perimeter = 2 * (length + breath);
        System.out.println(perimeter);
        if (area > perimeter) {
            System.out.println("It is the greater than the area and less than the perimeter ");
        }
        if (area==perimeter) {
            System.out.println("The area is equal");
        }

        if (area<perimeter) {
            System.out.println("It is less than the area and greater than the perimeter");
        }


    }
}