package FixEmails;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        String inputName = scanner.nextLine();
        String inputEmail = "";

        while (!inputName.equals("stop")){

            inputEmail = scanner.nextLine();

            if (!inputEmail.endsWith(".com") && !inputEmail.endsWith(".us") && !inputEmail.endsWith(".uk")) {

                emails.putIfAbsent(inputName, inputEmail);
            }

            inputName = scanner.nextLine();

        }

        for (var chovek : emails.entrySet()){

            System.out.printf("%s -> %s", chovek.getKey(), chovek.getValue());
            System.out.println();

        }

    }


}
