package UniqueUsernames;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> usernames = new LinkedHashSet<>();


        int number = Integer.parseInt(scanner.nextLine());

        String input;

        while (number-- > 0){

            input = scanner.nextLine();
            usernames.add(input);

        }

        for (String username : usernames){

            System.out.println(username);

        }

    }

}


