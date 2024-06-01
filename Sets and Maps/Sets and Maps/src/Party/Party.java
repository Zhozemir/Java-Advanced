package Party;

import java.util.Scanner;
import java.util.TreeSet;

public class Party {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        TreeSet<String> vip = new TreeSet<>();

        TreeSet<String> regular = new TreeSet<>();

        String input = scanner.nextLine();

        while(!input.equals("PARTY")){

            if (Character.isDigit(input.charAt(0))){

                vip.add(input);

            }
            else {

                regular.add(input);

            }

            input = scanner.nextLine();

        }

        input = scanner.nextLine();

        while(!input.equals("END")){

            vip.remove(input);
            regular.remove(input);

            input = scanner.nextLine();

        }

        System.out.println(vip.size() + regular.size());

        for (String reservation : vip){

            System.out.println(reservation);

        }

        for (String reservation : regular){

            System.out.println(reservation);

        }

    }


}
