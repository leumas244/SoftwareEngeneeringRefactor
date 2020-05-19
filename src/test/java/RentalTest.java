import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    Movie TestMovieClass = new Movie("testMovie", 2);
    Rental RentalTestClass = new Rental(TestMovieClass, 1);

    @Test
    void getDaysRented() {
        assertEquals(1, RentalTestClass.getDaysRented());
    }

    @Test
    void getMovie() {
        assertEquals(TestMovieClass, RentalTestClass.getMovie());
    }

    @Test
    void getRentCosts() {
        assertEquals(1.5, RentalTestClass.getRentCosts());
    }

    @Test
    void addFrequentRenterPoints() {
        assertEquals(1, RentalTestClass.addFrequentRenterPoints());
    }
}