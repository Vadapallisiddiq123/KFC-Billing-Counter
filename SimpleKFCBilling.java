import java.util.*;
public class SimpleKFCBilling {

    public static void main(String[] args) {
        showMenu();
        int orderNumber = takeOrder();
        processPayment(orderNumber);
        tellToWait();
        generateBill(orderNumber);
    }

    public static void showMenu() {
        System.out.println("Welcome to KFC! Here is our menu:");
        System.out.println("1. Chicken Bucket - $10");
        System.out.println("2. Burger - $5");
        System.out.println("3. Fries - $3");
        System.out.println("4. Drink - $2");
        System.out.println("5. chicken bryini - 250");
    }

    public static int takeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the item you want to order:");
        int orderNumber = scanner.nextInt();
        return orderNumber;
    }

    public static void processPayment(int orderNumber) {
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        if (orderNumber == 1) {
            price = 10;
        } else if (orderNumber == 2) {
            price = 5;
        } else if (orderNumber == 3) {
            price = 3;
        } else if (orderNumber == 4) {
            price = 2;
        }
        System.out.println("The price is: $" + price);
        System.out.println("Please enter the amount to pay:");
        int payment = scanner.nextInt();
        if (payment >= price) {
            int change = payment - price;
            System.out.println("Payment successful! Your change is: $" + change);
        } else {
            System.out.println("Not enough money. Try again.");
            processPayment(orderNumber);
        }
    }

    public static void tellToWait() {
        System.out.println("Please wait while we prepare your order.");
    }

    public static void generateBill(int orderNumber) {
        int tokenNumber = 1;
        System.out.println("Your token number is: " + tokenNumber);
        System.out.println("Thank you for visiting KFC!");
    }
}
