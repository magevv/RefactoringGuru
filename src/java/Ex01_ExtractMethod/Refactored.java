package Ex01_ExtractMethod;


import java.util.Enumeration;

public class Refactored {

    String name;
    Order orders;

    void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    public double getOutstanding() {
        Enumeration elements = orders.elements();
        double outstanding = 0.0;
        while (elements.hasMoreElements()) {
            Order each = (Order) elements.nextElement();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    public void printBanner() {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }

    public void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}
