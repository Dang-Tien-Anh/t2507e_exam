package Main.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Input ID: ");
        p.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Input Name: ");
        p.setName(sc.nextLine());

        System.out.print("Input Thumbnail path: ");
        p.setThumbnail(sc.nextLine());

        System.out.print("Input Price: ");
        p.setPrice(sc.nextDouble());

        System.out.print("Input Quantity: ");
        p.setQty(sc.nextInt());
        sc.nextLine();

        System.out.print("Input Description: ");
        p.setDescription(sc.nextLine());

        System.out.println("\n Showing product info:");
        p.displayInfo();

        System.out.print("\n Input order quantity: ");
        int orderQty = sc.nextInt();

        if(p.checkAvailability(orderQty)){
            double total = p.placeOrder(orderQty);
            System.out.println("Success!");
            System.out.println("Total: " + total);
        }else{
            System.out.println("Not enough in stock!");
        }
    }
}
