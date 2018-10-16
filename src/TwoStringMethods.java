public class TwoStringMethods {
    public static void main(String[] args) {
        boolean answer = abcTest(".abcdefg");
        System.out.println(answer);

        String result = alternateStrings("Hi", "There");
        System.out.println(result);
    }

    public static String alternateStrings(String string1, String string2) {
        String output = "";
        String largerPhrase = "";
        String smallerPhrase = "";
        int test = 0;

        if (string1.length() >= string2.length()){
            largerPhrase = string1;
            smallerPhrase = string2;
            test = 1;

        } else {
            largerPhrase = string2;
            smallerPhrase = string1;
            test = 2;
        }

        for (int i = 0; i < smallerPhrase.length(); i++) {
            if (test == 1) {
                output += largerPhrase.substring(i, i + 1);
                output += smallerPhrase.substring(i, i + 1);

            } else {
                output += smallerPhrase.substring(i, i + 1);
                output += largerPhrase.substring(i, i + 1);
            }
        }

        if (largerPhrase.length() != smallerPhrase.length()) {
            String remainder = largerPhrase.substring(smallerPhrase.length());
            output += remainder;
        }

        return output;
    }

    public static boolean abcTest(String phrase) {
        if (phrase.contains("abc") && !phrase.contains(".")) {
            return true;
        } else if (phrase.contains(".")) {
            if (phrase.indexOf(".") + 1 == phrase.indexOf("abc")) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }


}

