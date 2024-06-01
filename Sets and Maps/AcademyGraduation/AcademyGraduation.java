package AcademyGraduation;

import java.util.*;

public class AcademyGraduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        TreeMap <String, List<Double>> students = new TreeMap<>();

        Integer numberOfStudents = Integer.parseInt(scanner.nextLine());

        String inputName;
        String grades;

        while (numberOfStudents-- != 0){

            inputName =  scanner.nextLine();
            grades = scanner.nextLine();

            List<Double> gradesList = new ArrayList<>();

            String[] ocenki = grades.split(" ");

            Double sum = 0.0;

            for (int i = 0; i < ocenki.length; i++) {

                sum += Double.parseDouble(ocenki[i]);
                gradesList.add(Double.parseDouble(ocenki[i]));

            }

            Double averageGrade =  sum / ocenki.length;

            gradesList.add(averageGrade);

            students.put(inputName, gradesList);

        }

        for (String nameKey : students.keySet()){

            List<Double> gradesIter = students.get(nameKey);

                System.out.printf("%s is graduated with %s", nameKey, gradesIter.getLast().toString().trim());
                System.out.println();

            }

        }

    }


