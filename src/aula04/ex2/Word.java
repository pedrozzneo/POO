package aula04.ex2;

public class Word {
    public static int repetitionsInString(String string, String word){
        word = word.replace(" ", "");
        string = string.trim();

        if(word.equals("") || string.equals("")) return -1;

        int count = 0;
        while(string.indexOf(word) != -1){
            count++;
            string = string.substring(string.indexOf(word) + 1);
        }

        return count;
    }
}
