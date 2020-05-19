import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    int priceCode = 2;
    int daysRented = 1;
    Movie TestMovieClass = new Movie("testMovie", priceCode);
    Rental RentalTestClass = new Rental(TestMovieClass, daysRented);
    Customer TestCustomerClass = new Customer("TestCustomer");


    @Test
    void getName() {
        assertEquals("TestCustomer", TestCustomerClass.getName());
    }

    @Test
    void statement() {
        String statement = "Rental Record for TestCustomer" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        assertEquals(statement, TestCustomerClass.statement());
    }

    @Test
    void addRental() {
        TestCustomerClass.addRental(RentalTestClass);

        String statement = "Rental Record for TestCustomer" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "\t" + "testMovie" + "\t" + "\t" + "1" + "\t" + "1.5" + "\n";
        statement += "Amount owed is " + "1.5" + "\n";
        statement += "You earned " + "1" + " frequent renter points";

        assertEquals(statement, TestCustomerClass.statement());
    }
}