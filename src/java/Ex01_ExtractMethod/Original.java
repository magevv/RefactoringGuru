package Ex01_ExtractMethod;

import Ex01_ExtractMethod.Order;

import java.util.Enumeration;

public class Original {

    String name;
    Order orders;

    void printOwing() {

        Enumeration elements = orders.elements();
        double outstanding = 0.0;

        // print banner
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");

        // print owings
        while (elements.hasMoreElements()) {
            Order each = (Order) elements.nextElement();
            outstanding += each.getAmount();
        }

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}
