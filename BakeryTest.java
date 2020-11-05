package client;

import java.util.Scanner;

public class BakeryTest {
    // Beverage -> Cookie
    // Waffle -> Cake
    // BeverageFactory -> CookieFactory
    // Cook -> Baker
    // WaffleFactory -> CakeFactory
    // WaffleOrder -> CakeOrder
    // Waitress -> Customer
    public static void main(String[] args) {
        Baker baker = new Baker();
        Customer customer = new Customer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Bakery!");
            System.out.println("What would you like to order?");
            System.out.println("Please enter a number: ")
            System.out.println("1. Cake");
            System.out.println("2. Cookie");
            System.out.println("0. My order is complete.");

            int order = scanner.nextInt();
            if(order == 1) {
                // cake ingredients, types, etc
            } else if (order == 2) {
                // cookie ingredients, types, etc
            } else /*if order == 0 */ {
                // enjoy message
            }
        }
    }

}