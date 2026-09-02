package aula04.exI;

/*
    I sent this prompt below to the AI:

    write for me a ready-to-copy-and-paste message, in natural english language,
    with simple validations for the conventional names for VARIABLE, CONSTANT, CLASS and METHOD in java.
    I've just started learning Strings in java, this is for an assignment from college, no need to be
    that complex!

    Here is the response:

    NAMING CONVENTION RULES — Java (simple version)

    Rules that apply to ALL conventions:
    1. The name cannot be empty.
    2. The first character must be a letter (never a digit, never a symbol).
    3. The name cannot contain spaces or symbols such as - . , ! @ # $ % / ( )
       The only exception is the underscore _ , which is allowed in CONSTANT only.

    VARIABLE  — lowerCamelCase
    - The first character must be a lowercase letter.
    - Every other character must be a letter or a digit.
    - No underscores.
    - Uppercase letters are allowed in the middle, to separate words.
    - Valid:   age, userName, totalValue2
    - Invalid: Age, user_name, USERNAME, 2age, user name

    METHOD — lowerCamelCase (same rules as VARIABLE)
    - The first character must be a lowercase letter.
    - Every other character must be a letter or a digit.
    - No underscores.
    - Valid:   run, getName, calculateTotal
    - Invalid: GetName, get_name, 1getName

    CLASS — UpperCamelCase
    - The first character must be an uppercase letter.
    - Every other character must be a letter or a digit.
    - No underscores.
    - Valid:   Person, BankAccount, Client2
    - Invalid: person, Bank_Account, 1Person

    CONSTANT — UPPER_SNAKE_CASE
    - The first character must be an uppercase letter.
    - Every character must be an uppercase letter, a digit, or an underscore.
    - No lowercase letters at all.
    - The name cannot end with an underscore.
    - The name cannot have two underscores in a row.
    - Valid:   PI, MAX_SIZE, DEFAULT_VALUE_2
    - Invalid: maxSize, Max_Size, MAX_SIZE_, MAX__SIZE, _MAX
     */

public class NamingConventions {
    public static boolean startWithUpperCaseLetter(String string){
        String charsAllowed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int count = 0;
        for (char c : charsAllowed.toCharArray()) {
            if(string.toCharArray()[0] == c){
                count++;
                break;
            }
        }

        return count == 1;
    }

    public static boolean validConstant(String string, Convention convention){
        if(!startWithUpperCaseLetter(string)) return false;

        String charsAllowed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String simbolsAllowed = "_$";
        String numbersAllowed = "0123456789";
        String allAllowed = charsAllowed + simbolsAllowed + numbersAllowed;

        for (char c : string.toCharArray()) {
            for (char c1 : allAllowed.toCharArray()) {
                if(c != c1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isFollowingConvetion(String string, Convention convention){
        if(convention == Convention.CONSTANT){
           return validConstant(string, convention);
        }

        return true;
    }
}
