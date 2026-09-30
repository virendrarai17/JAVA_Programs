public class CheckIsNumeric {

    // Check if CharSequence is empty or null
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    // Check if String contains only digits, considering negative numbers
    public static boolean isNumeric(CharSequence cs) {
        if (isEmpty(cs)) {
            return false;
        }

        int len = cs.length();
        int start = 0;

        // Allow a leading minus sign for negative numbers
        if (cs.charAt(0) == '-') {
            if (len == 1) { // "-" alone is not a valid number
                return false;
            }
            start = 1; // Start checking digits from the second character
        }

        // Check if all characters are digits
        for (int i = start; i < len; i++) {
            if (!Character.isDigit(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("123"));      // true
        System.out.println(isNumeric("abcd"));     // false
        System.out.println(isNumeric("abcd123"));  // false
        System.out.println(isNumeric("0"));        // true
        System.out.println(isNumeric(null));       // false
        System.out.println(isNumeric(""));         // false
        System.out.println(isNumeric("-123"));     // true
        System.out.println(isNumeric("-"));     // false      
        System.out.println(isNumeric("\u0967"));   // true (Hindi numeral 0)
    }
}
