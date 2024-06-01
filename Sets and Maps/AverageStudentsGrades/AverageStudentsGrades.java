package AverageStudentsGrades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> studentsWithGrades = new TreeMap<>();

        while (n-- > 0){

            String[] input = scanner.nextLine().split("\\s++");

            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            studentsWithGrades.putIfAbsent(name, new ArrayList<>());

            List<Double> grades = studentsWithGrades.get(name);
            grades.add(grade);

        }

        for (var entry : studentsWithGrades.entrySet()) {

            String name = entry.getKey();

            String grades = "";

            double sum = 0;

            for (Double grade : entry.getValue()) {

                grades += String.format("%.2f ", grade);
                sum += grade;

            }

            System.out.println(String.format("%s -> %s(avg: %.2f)", name, grades, sum / entry.getValue().size()));

        }

    }

}
