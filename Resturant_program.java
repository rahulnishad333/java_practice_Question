import java.util.Scanner;

public class  Resturant_program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double totalPrice = 0.0;
        String itemName = "";
        double itemPrice = 0.0;

        do {
        	System.out.println("====> 	WELCOM	 <==== 	  ");
        	System.out.println("====| DEVELOPER'S HOTEL |====");
        	
            System.out.println("> Menu Card <");
            System.out.println("Starters Menu:");
            System.out.println("1. Paneer Chilly - Rs. 100");
            System.out.println("2. Aloo Tikki - Rs. 150");
            System.out.println("3. Paneer Pakoda - Rs. 180");

            System.out.println("Main Course Menu:");
            System.out.println("4. Shahi Paneer - Rs. 300");
            System.out.println("5. Dal Tadka - Rs. 200");
            System.out.println("6. Paneer Pulao - Rs. 250");

            System.out.println("Desired Menu:");
            System.out.println("7. Gulab Jamun - Rs. 90");
            System.out.println("8. Ice-Cream - Rs. 90");
            System.out.println("9. Rasgulla - Rs. 90");
            System.out.println("10. Exit");
            System.out.println("===================");

            System.out.print("Enter the item number you want to select: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    itemName = "Paneer Chilly";
                    itemPrice = 100.0;
                    break;
                case 2:
                    itemName = "Aloo Tikki";
                    itemPrice = 150.0;
                    break;
                case 3:
                    itemName = "Paneer Pakoda";
                    itemPrice = 180.0;
                    break;
                case 4:
                    itemName = "Shahi Paneer";
                    itemPrice = 300.0;
                    break;
                case 5:
                    itemName = "Dal Tadka";
                    itemPrice = 200.0;
                    break;
                case 6:
                    itemName = "Paneer Pulao";
                    itemPrice = 250.0;
                    break;
                case 7:
                    itemName = "Gulab Jamun";
                    itemPrice = 90.0;
                    break;
                case 8:
                    itemName = "Ice-Cream";
                    itemPrice = 90.0;
                    break;
                case 9:
                    itemName = "Rasgulla";
                    itemPrice = 90.0;
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Invalid item number. Please try again.");
                    continue;
            }

            if (choice == 10) {
                break;
            }

            System.out.println("You selected: " + itemName);
            System.out.println("Price: Rs. " + itemPrice);

            totalPrice += itemPrice;

            System.out.print("Do you want to add any more items? (Y/N): ");
            String addMore = scanner.next();
            if (addMore.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);

        System.out.println("Total Bill Amount: Rs. " + totalPrice);
        System.out.println("Thank you for your order!");
    }
}
