package be.ehb.mathapp.utils;

public class StringUtils {

    public static boolean isPalindroom(String input){
        //clean up spaces and capital letters
        String cleanInput = input.trim().toLowerCase();
        //reverse it
        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();

        return cleanInput.equals(reversed);
    }
}
