// Eat All You Can Eatery
// Created by Christiane A. Bacani
import java.util.Scanner;
public class EatAllYouCan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {190,200,210,220,230};
        boolean sell = true;
        int total = 0;
        
        System.out.print("Welcome to Bacani`s Eat All You Can Eatery!|\n");
        
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        while(sell){
        System.out.print("    AVAILABLE FOODS\n");
        System.out.print("FOOD\t\t\tPRICE\n");
        System.out.print("1.) Menudo\t\tP 190\n");
        System.out.print("2.) Giniling\t\tP 200\n");
        System.out.print("3.) Afritada\t\tP 210\n");
        System.out.print("4.) Bopis\t\tP 220\n");
        System.out.print("5.) Bicol Express\tP 230\n");
        System.out.print("Enter your choice here  : ");
        int choice = input.nextInt();
        
        System.out.print("Enter the quantity here : ");
        int quantity = input.nextInt();
        
        total += price[choice - 1] * quantity;
        
        System.out.print("Do you want to buy more meals ? (y/n) : ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            sell = false;
            System.out.print("The total price is : P " + total + "\n");
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change + "\n");
            
            System.out.print("Press enter to exit : ");
            input.nextLine();
            String exit = input.nextLine();
            
            System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!");
            
            
        }
        
        }
        
    }
}
