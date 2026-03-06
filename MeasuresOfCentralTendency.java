public class MeasuresOfCentralTendency {


    public static double calculateSum(double [] numbers){

        double sum = 0;
            for (double number : numbers) {
            sum += number;


}
     return sum;
}
    
    public static double calculateMean(double[] numbers) {

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

         return sum / numbers.length;
    }


    public static double[] subtractNumberFromMean(double[] numbers) {

    double mean = calculateMean(numbers);
    double[] result = new double[numbers.length];

    for (int counter = 0; counter < numbers.length; counter++) {
        double difference = mean - numbers[counter];
        result[counter] = difference * difference;
    }

    return result;


}


    public static double[] calculateSquaredDifferenceFromFive(double[] inputNumbers) {
        double[] squaredDifferences = new double[inputNumbers.length];
        for (int index = 0; index < inputNumbers.length; index++) {
            double differenceFromFive = 5 - inputNumbers[index];
            squaredDifferences[index] = Math.pow(differenceFromFive, 2);
        }
        return squaredDifferences;

}

   

     public static double sumArray(double[] numbers) {
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            return sum;
    }




     public static double meanOfArray(double sum, double numberOfElements) {
            if (numberOfElements == 0) 
                return 0; 
            return sum / numberOfElements;


        }


     public static double calculateStandardDeviation(double meanSquare) {
            return Math.sqrt(meanSquare);
        }

}
