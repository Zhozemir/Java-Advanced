package PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        HashMap<String, String> ukazatel = new HashMap<>();

        String input = scanner.nextLine();

        while (! input.equals("search")){

            String[] parts = input.split("-");

            ukazatel.put(parts[0], parts[1]);

            input = scanner.nextLine();

        }


        input = scanner.nextLine();

        System.out.println();

        while (!input.equals("stop")){

            if (ukazatel.containsKey(input)){

                System.out.printf("%s -> %s", input, ukazatel.get(input));
                System.out.println();

            } else {

                System.out.printf("Contact %s does not exist.", input);
                System.out.println();

            }

            input = scanner.nextLine();

        }

        }

     }



