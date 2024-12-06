package Control_Statement.java;
import java.util.Scanner;
public class CostPrize_SellingPrize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the prize : ");
        int cost_prize = sc.nextInt();
        System.out.println("Enter the selling prize : ");
        int selling_prize = sc.nextInt();
        if(cost_prize<selling_prize){
            System.out.println("Your profit is : ");
            System.out.println(selling_prize-cost_prize);
        }
        if(selling_prize==cost_prize){
            System.out.println("No profit and no loss");
        }
        else{
            System.out.println("You are loss is :  " );
            System.out.println(cost_prize-selling_prize);

        }
    }

}
