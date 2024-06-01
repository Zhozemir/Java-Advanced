package ParkingLot;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {

    public static void main(String[] args) {

       Scanner scanner = new Scanner (System.in);

       LinkedHashSet<String> parking = new LinkedHashSet<>();

       String input = scanner.nextLine();

        while (!input.equals("END")){

            String[] elements = input.split(",");
            String command = elements[0];
            String carNumber = elements[1].trim();

            if (command.equals("IN")){

                parking.add(carNumber);

            }
            else {

                parking.remove(carNumber);

            }

            input = scanner.nextLine();

        }

        if(parking.isEmpty()) {

            System.out.println("Parking Lot is Empty");

        }
        else {

            for (String carNumber : parking)
                System.out.println(carNumber);

        }
    }

}
