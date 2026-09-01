package aula04.exI;

public class NamingConventions {
    public static boolean validConstant(String string, Convention convention){
        String charsAllowed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String simbolsAllowed = "_";
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
