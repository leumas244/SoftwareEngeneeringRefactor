import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer TestCustomer = new Customer("TestName");


    @Test
    void addRental() {
    }

    @Test
    void getName() {
        assertEquals("TestName", TestCustomer.getName());
    }

    @Test
    void statement() {
    }
}