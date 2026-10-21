package aula07.exercises.ex1;

import java.util.*;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas palavras voce gostaria de inserir?: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Set<String> stringsSet = new TreeSet<>();
        List<String> stringsList = new ArrayList<>();
        Map<String, Integer> stringFrequencyMap = new HashMap<>();

        for (int i = 0; i < quantity; i++) {
            String string = scanner.nextLine();
            stringsSet.add(string);
            stringsList.add(string);

            if(stringFrequencyMap.containsKey(string)){
                Integer number = stringFrequencyMap.get(string);
                number++;
                stringFrequencyMap.put(string, number);
            }
            else{
                stringFrequencyMap.put(string, 1);
            }
        }

        System.out.println("todas as palavras sem distinção: " + stringsList);
        System.out.println("todas as palavras distinstas em ordem alfabética: " + stringsSet);
        System.out.println("todas as frequencias das palavras: " + stringFrequencyMap);
    }
}
