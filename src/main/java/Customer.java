import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector _rentals = new Vector();

    public Customer (String newname){
        name = newname;
    };

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    };

    public String getName (){
        return name;
    };

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = _rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) enum_rentals.nextElement();

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t"
                    + String.valueOf(each.getRentCosts()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration all_rentals = _rentals.elements();
        while (all_rentals.hasMoreElements()) {
            Rental each = (Rental) all_rentals.nextElement();
            result += each.getRentCosts();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration all_rentals = _rentals.elements();
        while (all_rentals.hasMoreElements()) {
            Rental each = (Rental) all_rentals.nextElement();
            result += each.addFrequentRenterPoints();
        }
        return result;
    }

}
    