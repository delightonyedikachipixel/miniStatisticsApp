import java.util.Scanner;

public class PizzaWahala{

public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Welcome to  Iya Scambirah PIzza Joint Ajegunle");

System.out.println("---------------------------------------------------------");

System.out.println("|Pizza Number   |Pizza Type     |Number Of Slices     |Prices Per Box |");

System.out.println(" 1.             |Sapa Size        |4                    |2000        |");

System.out.println(" 2.             |Small Money      |6                    |2400        |");

System.out.println(" 3.             |Big Boys         |8                    |3000        |");

System.out.println(" 4.             |Odogwu           |12                   |4200        |");

System.out.println ("Enter number of guests:");
int numberOfGuests = input.nextInt();


System.out.println("Choose a Pizza Type (1-4):");
int choice = input.nextInt();


    if (choice < 0 || choice > 4){
        System.out.print("invalid choice");
}

int slices = getSlices(choice);
int price = getPrice(choice);

        int boxes = calculateBoxes(numberOfGuests, slices);
        int leftover = calculateLeftover(numberOfGuests, slices, boxes);
        int totalCost = calculateCost(boxes, price);

        System.out.println("\n------ Purchase Summary ------");
        System.out.println("Number of Pizza Boxes: " + boxes);
        System.out.println("Leftover Slices: " + leftover);
        System.out.println("Total Amount to Pay: " + totalCost);
        System.out.println("------------------------------");
    }

    
    public static int getSlices(int choice) {

        if (choice == 1){
            return 4;
}
        if (choice == 2){ 
            return 6;
}
        if (choice == 3){
             return 8;
}
        if (choice == 4){
            return 12;
}

  return 0;      
    }

    public static int getPrice(int choice) {

        if (choice == 1){
            return 2000;
}
        if (choice == 2) {
            return 2400;
}
        if (choice == 3){
            return 3000;
}
        if (choice == 4){
            return 4200;
}

return 0;        
    }

    public static int calculateBoxes(int numberOfGuests, int slices) {

        int boxes = numberOfGuests / slices;

        if (numberOfGuests % slices != 0) {
            boxes++;
        }

        return boxes;
    }

    public static int calculateLeftover(int numberOfGuests, int slices, int boxes) {

        int totalSlices = boxes * slices;
        return totalSlices - numberOfGuests;
    }

    public static int calculateCost(int boxes, int price) {

        return boxes * price;
    }

   
}





