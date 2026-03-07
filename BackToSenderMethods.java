import java.util.Scanner;

public class BackToSenderMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int basePay = 5000;

        System.out.print("""
                Collection Rate    Amount per Parcel     Base Pay

                 less than 50%         160                5000
                  50%- 59%             200                5000
                  60% - 69%            250                5000
                  >= 70%               500                5000
                """);

        System.out.println("Enter rider's name:");
        String ridersname = input.nextLine();

        System.out.println("Enter number of successful deliveries:");
        int numberofdeliveries = input.nextInt();

        
        int totalPay = calculatePay(numberofdeliveries, basePay);

        System.out.println("Rider: " + ridersname);
        System.out.println("Total Pay: " + totalPay);
    }

    
    public static int calculatePay(int deliveries, int basePay) {

        if (deliveries < 50) {
            return deliveries * 160 + basePay;
        } 
        else if (deliveries <= 59) {
            return deliveries * 200 + basePay;
        } 
        else if (deliveries <= 69) {
            return deliveries * 250 + basePay;
        } 
        else {
            return deliveries * 500 + basePay;
        }
    }
}
