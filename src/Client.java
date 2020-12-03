import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String cookieType="";
    // main method
    public static void main(String[] args) {
        Cashier cashier = new Cashier(); 
        Baker baker = new Baker(); 

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What would you like to order? Enter the corresponding number.");
            System.out.println("(1) A Cake");
            System.out.println("(2) A Cookie");
            System.out.println("If done, enter any number other than 1 or 2 to complete your order.");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> cakeFlavorList = new ArrayList<>();
                ArrayList<String> frostingList = new ArrayList<>();
                ArrayList<String> sprinklesList = new ArrayList<>();

                String cakeType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which cake do you want?");
                    System.out.println("(1) Rectangular Cake --- $5.00");
                    System.out.println("(2) Circular Cake --- $4.00");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    assert answer != null;
                    if (answer.equals("1")) {
                        cakeType = "Rectangular Cake";
                        System.out.println("A Rectangular Cake is chosen.");
                        break;
                    } else if (answer.equals("2")) {
                        cakeType = "Circular Cake";
                        System.out.println("A Circular Cake is chosen.");
                        break;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- Designing Your Cake --------------------");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 1; i++) {
                    System.out.println("Would you like vanilla or chocolate as the flavor of your cake? Enter the corresponding number.");
                    System.out.println("(1) Vanilla --- $1.50");
                    System.out.println("(2) Chocolate --- $1.25");
                    System.out.println("Enter any number other than 1 or 2 to let the baker pick.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        cakeFlavorList.add("Vanilla");
                        System.out.println("Vanilla is chosen.");
                    } else if (value == 2) {
                        cakeFlavorList.add("Chocolate");
                        System.out.println("Chocolate is chosen.");
                    } else break;
                }
                System.out.println("The flavor of your cake has been chosen.");
                System.out.println("");
           
                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 1; i++) {
                    System.out.println("What flavor frosting would you like on your cake? Enter the corresponding number.");
                    System.out.println("(1) Vanilla --- $0.75");
                    System.out.println("(2) Chocolate --- $0.65");
                    System.out.println("(3) Vegan Buttercream --- $0.85");
                    System.out.println("Enter any number other than 1 or 2 to let the baker pick.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        frostingList.add("Vanilla Frosting");
                        System.out.println("Vanilla Frosting is chosen.");
                    } else if (value == 2) {
                        frostingList.add("Chocolate Frosting");
                        System.out.println("*** Chocolate Frosting is chosen.");
                    } else if (value == 3) {
                        frostingList.add("Vegan Buttercream Frosting");
                        System.out.println("Vegan Buttercream Frosting is chosen.");
                    } else break;
                }
                System.out.println("The flavor of your frosting has been chosen.");
                System.out.println("");

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 1; i++) {
                    System.out.println("What color or flavor sprinkles would you like on your cake?");
                    System.out.println("(1) White Sprinkles --- $2.50");
                    System.out.println("(2) MultiColor Sprinkles --- $1.50");
                    System.out.println("(3) Coconut --- $3.35");
                    System.out.println("Enter any number other than 1 or 2 to let the baker pick.");
                    int value = scan3.nextInt();
                    if (value == 1) {
                        sprinklesList.add("White Sprinkles");
                        System.out.println("White Sprinkles are chosen.");
                    } else if (value == 2) {
                        sprinklesList.add("Multicolor Sprinkles");
                        System.out.println("Multicolor Sprinkles are chosen.");
                    } else if (value == 3) {
                        sprinklesList.add("Coconut Flakes");
                        System.out.println("Coconut Flakes are chosen.");
                    } else break;
                }
                // add
                System.out.println("The choice of the color/flavor of your sprinkles has been chosen.");
                System.out.println("");

                String[] chocoArr = new String[cakeFlavorList.size()];
                chocoArr = cakeFlavorList.toArray(chocoArr);

                String[] frostingArr = new String[frostingList.size()];
                frostingArr = frostingList.toArray(frostingArr);

                String[] condimentArr = new String[sprinklesList.size()];
                condimentArr = sprinklesList.toArray(condimentArr);

                CakeOrder cakeOrder = new CakeOrder(baker, cakeType, chocoArr, frostingArr, condimentArr); 
                cashier.takeOrder(cakeOrder);
            }

            else if(a==2) {
                Scanner scanCookie = new Scanner(System.in);
                System.out.println("***Please have a look at all of our options below***");
                for (int i = 0; i < 1; i++) {
                    System.out.println("Your cookie options are:");
                    System.out.println("===================================="); 
                    System.out.println("(1) Sugar Cookie --- $2.50");
                    System.out.println("(2) Peanut Butter --- $5.50");
                    System.out.println("(3) Chocolate Chip --- $4.00");
                    System.out.println("(4) Coconut Cookie --- $4.50");
                    System.out.println("(5) Oatmeal Raisin --- $4.00");
                    System.out.println("(6) Vanilla Cookie --- $4.00");
                    System.out.println("(Other) I finished the cookie selection.");
                    int cookieChoice = scanCookie.nextInt();
                    if(cookieChoice == 1){
                        cookieType="Sugar";
                        System.out.println("A sugar cookie is chosen.");
                    }
                    else if(cookieChoice == 2){
                        cookieType="Peanut Butter";
                        System.out.println("A peanut butter cookie is chosen.");
                    }
                    else if(cookieChoice==3){
                        cookieType="Chocolate Chip";
                        System.out.println("A chocolate chip cookie is chosen.");
                    }
                    else if(cookieChoice==4){
                        cookieType="Coconut";
                        System.out.println("A coconut cookie is chosen.");
                    }
                    else if(cookieChoice==5){
                        cookieType="Oatmeal Raisin";
                        System.out.println("An oatmeal raisin cookie is chosen.");
                    }
                    else if(cookieChoice==6){
                        cookieType="Vanilla";
                        System.out.println("A vanilla cookie is chosen.");
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The selection of cookies is complete.");
                System.out.println("");

                CookieOrder cookieOrder = new CookieOrder(baker, cookieType);
                cashier.takeOrder(cookieOrder);
            }

            else{
                System.out.println("=========================================================");
                System.out.println("Thank you for shopping with us. Have a great day!");
                break;
            }
        }
    }
}