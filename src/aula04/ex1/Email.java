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
    public Email(){}

   public static boolean isValid(String email){
        if(email == null || email.trim().equals("")){
            return false;
        }

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
}
