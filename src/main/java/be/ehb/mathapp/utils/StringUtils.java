package be.ehb.mathapp.utils;

public class StringUtils {

    public static boolean isPalindroom(String input){
        //clean up spaces and capital letters
        String cleanInput = input.replace(" ", "").toLowerCase();
        //reverse it
        StringBuilder sb = new StringBuilder(cleanInput);
        String reversed = sb.reverse().toString();

        return cleanInput.equals(reversed);
    }
}
