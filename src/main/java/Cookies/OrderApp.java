package Cookies;

import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cookies.MasterOrder myOrder = new Cookies.MasterOrder();
        myOrder.addOrder(new Cookies.CookieOrder("TagaLongs", 1));
        myOrder.addOrder(new Cookies.CookieOrder("Thin Mints", 5));
        myOrder.addOrder(new Cookies.CookieOrder("Samoas", 2));
        myOrder.addOrder(new Cookies.CookieOrder("TagaLongs", 3));

        System.out.println("Current order");
        myOrder.showOrder();
        System.out.println();
        System.out.println("You have ordered " + myOrder.getTotalBoxes() + " boxes");
        System.out.println();
        System.out.println("What would you like to remove? (specify a variety or none)");

        String varietyToRemove = input.nextLine();

        System.out.println("You are removing " + myOrder.getVarietyBoxes(varietyToRemove) + " " + varietyToRemove);

        myOrder.removeVariety(varietyToRemove);

        System.out.println("Current order");

        myOrder.showOrder();


    }
}
