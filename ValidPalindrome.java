public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("\\p{Punct}|\\s", "");
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        return reversedStr.equalsIgnoreCase(str);


    }
}
