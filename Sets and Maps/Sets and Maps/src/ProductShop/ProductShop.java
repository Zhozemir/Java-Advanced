package ProductShop;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        TreeMap<String, LinkedHashMap<String, Double>> productShops =  new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")){

            String[] elements = input.split(", ");

            String shopKey = elements[0];
            String product = elements[1];
            Double price = Double.parseDouble(elements[2]);


            productShops.putIfAbsent(shopKey, new LinkedHashMap<>());

            productShops.get(shopKey).put(product, price);

            input = scanner.nextLine();

        }

        for (String shopKey : productShops.keySet()){

            System.out.printf("%s->%n", shopKey);
            LinkedHashMap<String, Double> products = productShops.get(shopKey);
            for (String product: products.keySet()){

                // .get() - взима стойността свързана с дадения ключ

                double price = products.get(product);
                System.out.printf("Product: %s, Price: %.1f\n", product, price);

            }

        }

    }

}
