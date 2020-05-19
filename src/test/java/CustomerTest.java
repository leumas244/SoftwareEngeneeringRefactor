import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer TestCustomerClass = new Customer("TestName");


    @Test
    void addRental() {
    }

    @Test
    void getName() {
        assertEquals("TestName", TestCustomerClass.getName());
    }

    @Test
    void statement() {
    }
}