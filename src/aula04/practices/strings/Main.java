package aula04.practices.strings;

import java.util.StringJoiner;

public class Main {
    static void main() {
        String string = "hey, im a string";

        string += "hey im concatenating on that string, but under the hood I will have my own instance, java will put us together in another string and change the pointer as string are immutable";

        char[] charArray = string.toCharArray();

        int positionOfFirstFoundChar = string.indexOf('e');
        System.out.println(positionOfFirstFoundChar);
        
        char charAtBeggining = string.charAt(0);
        System.out.println("charAtBeggining = " + charAtBeggining);
        
        int lengthOfString = string.length();
        System.out.println("lengthOfString = " + lengthOfString);

        String literal = "literal";
        String literal2 = "literal";
        // java makes both literals point to the same place to optmize, however if I exlicit use new, it goes to different places

        String explicit = new String("literal");
        String explicit2 = new String("literal");

        if(literal == literal2){
            System.out.println("told ya");
        }
        if(explicit2 != explicit){
            System.out.println("told ya");
        }

        if(explicit.equals(explicit2)){
            System.out.println("the VALUES of both strings are the same");
        }

        System.out.printf("my name's %s, im %d years old, I've got R$%.2f into my account%n", "pedro", 22, 2000.23);
        System.out.println("%");

        StringBuilder sb = new StringBuilder(1000);

        sb.append("add this to sb without having to create a new String");
        sb.append("same as before, im more efficiet, no need to keep re-allocating if i know im gonna have many concatenations!!");
        System.out.println(sb);

        // a joiner allow us to determine the suffix of the string (ending), prefix (beggining) and what separates it append
        // lets create an "array" of "numbers" in String
        StringJoiner sj = new StringJoiner(",", "[", "]");

        for (int i = 0; i < 10; i++) {
            sj.add(String.valueOf(i));
        }

        System.out.println("sj = " + sj);
        
        // usually when we are programming, there are parts where the line break is ignored as it doesnt represent a new code, it just means that it was too clamped and I needed more space, or I want a better indentation but I want to do the same thing as if I just kept on the same row
        // when I dont want it to be ignored we use \n.. for example in database I have a command select...where, I want the same behavior but put each part on a differnet line, just add a line break and no prob, the interpreter wont read it different, it will ignore that
        // text blocks mean like: when I use line break, its a \n, when i use a lot of spaces, its a lot of spaces!! that makes sense with strings, sometimes I want that exact format, so I can write that format visually as I want and the spaces and line breaks will be replaced by the \n and so on
        // so at the end it will copy exact what you are seeing as it doesnt ignore the \n
        
        String json = """
                    json = {
                        hey bro
                    }""";
        System.out.println(json);
    }
}
