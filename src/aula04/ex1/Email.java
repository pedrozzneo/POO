package aula04.ex1;

/*
    I SENT THE SLIDES OF THIS CLASS TO THE AI AND THIS PROMPT BELOW:

    based ONLY on what's given of Strings from slides 17 to 23, give me ONLY the conditions in ENGLISH
    that I could write the code myself to determine whether an email is valid

    HERE IS THE RESPONSE THAT I NUMBERED MYSELF:

    1 -> The text is not null and, after removing leading/trailing spaces, is not empty.
    2 -> It contains an @.
    3 -> It contains exactly one @.
    4 -> There is at least one character before the @.
    5 -> There is at least one character after the @.
    6 -> The part after the @ contains a ..
    7 -> There is at least one character between the @ and that ..
    8 -> There is at least one character after the last ..
    9 -> It contains no blank spaces anywhere.
    10 -> It does not begin with @, ., _ or -.
    11 -> It does not end with @, ., _ or -.
    12 -> It contains no two consecutive dots.
    13 -> Every character is either a letter, a digit, or one of ., _, -, @.
    14 -> Any comparison of the extracted parts against expected values is done by content, not by reference.
*/

public class Email {
    public static boolean condition1(String email){
        if(email == null || email.trim().equals("")){
            return false;
        }
        return true;
    }

    public static boolean condition2and3(String email){
        int atCharCount = 0;

        for(char c : email.toCharArray()){
            if(c == '@'){
                atCharCount++;
            }
        }

        if(atCharCount != 1){
            return false;
        }
        return true;
    }

    public static boolean condition4(String email){
        int atCharIndex = email.indexOf('@');
        String charsBeforeAt = email.substring(0, atCharIndex).trim();

        if(charsBeforeAt.length() == 0){
            return false;
        }
        return true;
    }

    public static boolean condition5(String email){
        int atCharIndex = email.indexOf('@');

        String charsBetweenAtAndDot = email.substring(atCharIndex + 1);

        if(charsBetweenAtAndDot.length() == 0){
            return false;
        }
        return true;
    }

    public static boolean condition6(String email){
        int atCharIndex = email.indexOf('@');
        String charsAfterAt = email.substring(atCharIndex);

        int position = charsAfterAt.indexOf('.');
        if(charsAfterAt.indexOf('.') == -1){
            return false;
        }
        return true;
    }

    public static boolean condition7(String email){
        int atCharIndex = email.indexOf('@');
        int dotCharIndex = email.indexOf('.');

        String charsBetweenAtAndDot = email.substring(atCharIndex + 1, dotCharIndex);

        if(charsBetweenAtAndDot.length() == 0){
            return false;
        }
        return true;
    }

    public static boolean condition8(String email) {
        int lastDotCharIndex = email.indexOf('.');
        String charsAfterLastDot = email.substring(lastDotCharIndex + 1);

        while(charsAfterLastDot.indexOf('.') != -1){
            lastDotCharIndex = charsAfterLastDot.indexOf('.');
            charsAfterLastDot = charsAfterLastDot.substring(lastDotCharIndex + 1);
        }

        if(charsAfterLastDot.length() == 0){
            return false;
        }
        return true;
    }

    public static boolean condition9(String email) {
        if(email.indexOf(' ') == -1){
            return true;
        }
        return false;
    }

    public static boolean condition10and11(String email) {
        char[] notAllowedChars = {'@', '.', '_', '-'};

        for (char notAllowedChar : notAllowedChars) {
            if(notAllowedChar == email.toCharArray()[0] || notAllowedChar == email.toCharArray()[email.length() -1]){
                    return false;
            }
        }
        return true;
    }

    public static boolean condition12(String email) {
        int dotPosition = email.indexOf('.');
        String charsAfterDotPosition = email.substring(dotPosition + 1);

        while(charsAfterDotPosition.indexOf('.') != -1){
            dotPosition = charsAfterDotPosition.indexOf('.');
            if(dotPosition == 0){
                return false;
            }
            charsAfterDotPosition = charsAfterDotPosition.substring(dotPosition + 1);
        }
        return true;
    }

    public static boolean condition13(String email) {
        String allowed = "abcdefghijklmnopqrstuvwxyz0123456789._-@";
        boolean noneEqual;

        for (char c : email.toCharArray()) {
            noneEqual = true;

            for (char c1 : allowed.toCharArray()) {
                if(c1 == c){
                    noneEqual = false;
                    break;
                }
            }

            if(noneEqual) return false;
        }
        return true;
    }

   public static boolean isValid(String email){
        if(!condition1(email)) return false;
        if(!condition2and3(email)) return false;
        if(!condition4(email)) return false;
        if(!condition5(email)) return false;
        if(!condition6(email)) return false;
        if(!condition7(email)) return false;
        if(!condition8(email)) return false;
        if(!condition9(email)) return false;
        if(!condition10and11(email)) return false;
        if(!condition12(email)) return false;
        if(!condition13(email)) return false;

        return true;
   }
}
