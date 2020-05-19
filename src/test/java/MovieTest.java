import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    Movie TestMovieClass = new Movie("testMovie", 1);

    @Test
    void getPriceCode() {
        assertEquals(1, TestMovieClass.getPriceCode());
    }

    @Test
    void setPriceCode() {
        TestMovieClass.setPriceCode(2);
        assertEquals(2, TestMovieClass.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("testMovie", TestMovieClass.getTitle());
    }

    @Test
    void addFrequentRenterPoints() {
        assertEquals(1, TestMovieClass.addFrequentRenterPoints(0));
    }

    @Test
    void getRentCosts() {
        assertEquals(30.0, TestMovieClass.getRentCosts(10), 0);
    }
}