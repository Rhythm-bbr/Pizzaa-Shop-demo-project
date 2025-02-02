import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Here we sell pizzas");
        System.out.println("Which pizza would you like to have");
        System.out.print("small, medium, large, xlarge : ");
        String pizzaSize = input.nextLine();

        System.out.println("Which flavor pizza do you want");
        System.out.print("onion garlic, cheesy, spicy : ");
        String pizzaFlavor = input.nextLine();

        int smallOnion = 5;
        int mediumOnion = 10;
        int largeOnion = 15;
        int xlargeOnion = 20;

        int smallCheesy = 8;
        int mediumCheesy = 13;
        int largeCheesy = 17;
        int xlargeCheesy = 22;

        int smallSpicy = 3;
        int mediumSpicy = 8;
        int largeSpicy = 14;
        int xlargeSpicy = 18;

        if(pizzaSize.equals("small")){
            System.out.print("How many pizzas do you want : ");
            int quantity = input.nextInt();
            input.nextLine();

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            if(pizzaFlavor.equals("onion garlic")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + smallOnion + "$");
                System.out.println("Your total is $: " + smallOnion*quantity);
            }
            if(pizzaFlavor.equals("cheesy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + smallCheesy + "$");
                System.out.println("Your total is $: " + smallCheesy*quantity);
            }
            if(pizzaFlavor.equals("spicy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + smallSpicy + "$");
                System.out.println("Your total is $: " + smallSpicy*quantity);
            }
        }
        if(pizzaSize.equals("medium")){
            System.out.print("How many pizzas do you want : ");
            int quantity = input.nextInt();
            input.nextLine();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            if(pizzaFlavor.equals("onion garlic")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + mediumOnion + "$");
                System.out.println("Your total is $: " + mediumOnion*quantity);
            }
            if(pizzaFlavor.equals("cheesy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + mediumCheesy + "$");
                System.out.println("Your total is $: " + mediumCheesy*quantity);
            }
            if(pizzaFlavor.equals("spicy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + mediumSpicy + "$");
                System.out.println("Your total is $: " + mediumSpicy*quantity);
            }
        }
        if(pizzaSize.equals("large")){
            System.out.print("How many pizzas do you want : ");
            int quantity = input.nextInt();
            input.nextLine();

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            if(pizzaFlavor.equals("onion garlic")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + largeOnion + "$");
                System.out.println("Your total is $: " + largeOnion*quantity);
            }
            if(pizzaFlavor.equals("cheesy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + largeCheesy + "$");
                System.out.println("Your total is $: " + largeCheesy*quantity);
            }
            if(pizzaFlavor.equals("spicy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + largeSpicy + "$");
                System.out.println("Your total is $: " + smallSpicy*quantity);
            }
        }
        if(pizzaSize.equals("xlarge")){
            System.out.print("How many pizzas do you want : ");
            int quantity = input.nextInt();
            input.nextLine();

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            if(pizzaFlavor.equals("onion garlic")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + xlargeOnion + "$");
                System.out.println("Your total is $: " + xlargeOnion*quantity);
            }
            if(pizzaFlavor.equals("cheesy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + xlargeCheesy + "$");
                System.out.println("Your total is $: " + xlargeCheesy*quantity);
            }
            if(pizzaFlavor.equals("spicy")){
                System.out.println("you ordered " + quantity + " pizzas of " + pizzaFlavor + " flavor " + pizzaSize + "size");
                System.out.println("The prize of each is : " + xlargeSpicy + "$");
                System.out.println("Your total is $: " + xlargeSpicy*quantity);
            }
        }
//        else{
//            System.out.println("Please enter your options correctly");
//            System.out.println("If you are having any problem regarding order Then please contact costomer care");
//        }
        input.close();
    }
}


