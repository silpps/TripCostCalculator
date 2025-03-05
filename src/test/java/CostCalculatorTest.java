import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CostCalculatorTest {


    @Test
    void getTotalCost() {
        assertEquals(20, CostCalculator.getTotalCost(20, 1));
        assertEquals(200, CostCalculator.getTotalCost(20, 10));
        assertEquals(0, CostCalculator.getTotalCost(0, 10));
    }
}