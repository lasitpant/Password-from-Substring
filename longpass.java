import java.util.Scanner;

/**
 * Created by Lasit on 1/18/2017.
 */
 class longpass {
    public static int longpass(String S) {
        int i = 0;
        int longestStart = 0;
        int longestEnd = 0;
        while (i < S.length()) {
            // Skip past all the digits.
            while (i < S.length() && Character.isDigit(S.charAt(i))) {
                ++i;
            }

            // i now points to the start of a substring
            // or one past the end of the string.
            int start = i;

            // Keep a flag to record if there is an uppercase character.
            boolean hasUppercase = false;

            // Increment i until you hit another digit or the end of the string.
            while (i < S.length() && !Character.isDigit(S.charAt(i))) {
                hasUppercase |= Character.isUpperCase(S.charAt(i));
                ++i;
            }

            // Check if this is longer than the longest so far.
            if (hasUppercase && i - start > longestEnd - longestStart) {
                longestEnd = i;
                longestStart = start;
            }
        }
        String longest = S.substring(longestStart, longestEnd);
        if(longest.length()==0){
            return -1;
        }
        else{
            return 2;
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s=sc.next();

        int z=longpass(s);
        System.out.println(z);
    }
}
