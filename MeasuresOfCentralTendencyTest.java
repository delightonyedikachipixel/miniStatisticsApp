import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class MeasuresOfCentralTendencyTest {

    @Test
    public void testCalculateSum() {
        double[] numbers = {2, 4, 6, 8};

        double expectedResult = 20; 
        double actualResult = MeasuresOfCentralTendency.calculateSum(numbers);

        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void testCalculateMean() {
        double[] numbers = {2, 4, 6, 8};

        double expectedResult = 5; 
        double actualResult = MeasuresOfCentralTendency.calculateMean(numbers);

        assertEquals (expectedResult, actualResult);
    }


    @Test
    public void testSubtractNumberFromMean(){

        double [] numbers = {2, 4, 6, 8};
        double[] expectedResult = {9.0, 1.0, 1.0, 9.0}; 
        double[] actualResult = MeasuresOfCentralTendency.subtractNumberFromMean(numbers);

        assertArrayEquals (expectedResult, actualResult);
      


}


    @Test
    public void testCalculateSquareOfSubtractedNumbers(){
        double []numbers = {2, 4, 6, 8};
        double[] expectedResult = {9.0, 1.0, 1.0, 9.0};
        double[] actualResult= MeasuresOfCentralTendency.calculateSquaredDifferenceFromFive(numbers);
        assertArrayEquals (expectedResult, actualResult);

       
}



    @Test 
    public void testSumArray(){
        double []numbers = {2, 4, 6, 8};
        double expectedResult = 20.0; 
        double actualResult = MeasuresOfCentralTendency.calculateSum(numbers);

        assertEquals (expectedResult, actualResult);
}
        
 
    @Test
    public void  meanOfArray() {
        double []numbers = {2, 4, 6, 8};
          double expectedResult = 5.0; 
        double actualResult = MeasuresOfCentralTendency.calculateMean(numbers);

        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void testCalculateStandardDeviation() {
        double meanSquare = 25;
        double expectedStandardDeviation = 5.0; 
        double actualStandardDeviation = MeasuresOfCentralTendency.calculateStandardDeviation(meanSquare);
        assertEquals(expectedStandardDeviation, actualStandardDeviation);
    }
 


        }   





    
