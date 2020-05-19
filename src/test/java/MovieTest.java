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
}