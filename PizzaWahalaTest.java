import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaWahalaTest {

    @Test
    public void testGetSlices() {
        int choice = 2;
        int expectedResult = 6;

        int actualResult = PizzaWahala.getSlices(choice);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetPrice() {
        int choice = 3;
        int expectedResult = 3000;

        int actualResult = PizzaWahala.getPrice(choice);

        assertEquals(expectedResult, actualResult);
}



    @Test
    public void testCalculateBoxes() {
        int guests = 10;
        int slices = 4;
        int expectedResult = 3;

        int actualResult = PizzaWahala.calculateBoxes(guests, slices);

        assertEquals(expectedResult, actualResult);
}
    
    @Test
    public void testCalculateLeftover() {
        int guests = 10;
        int slices = 4;
        int boxes = 3;
        int expectedResult = 2;

        int actualResult = PizzaWahala.calculateLeftover(guests, slices, boxes);

        assertEquals(expectedResult, actualResult);

}



    @Test
    public void testCalculateCost() {
        int boxes = 3;
        int price = 2000;
        int expectedResult = 6000;

        int actualResult = PizzaWahala.calculateCost(boxes, price);

        assertEquals(expectedResult, actualResult);
}
}





