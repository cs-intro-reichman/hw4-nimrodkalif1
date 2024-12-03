public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        if (str == null)
            return null;
        String lower = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                c += (97 - 65);
            }
            lower += c;
        }
        return lower;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str1 == null || str2 == null)
            return false;
        if (str1.isEmpty() && str2.isEmpty())
            return false;
        if (!str1.isEmpty() && str2.isEmpty())
            return true;
        if (str1.length() < str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) != str2.charAt(j))
                        break;
                    else {
                        if (j == str2.length() - 1)
                            return true;
                    }
                    i++;
                    if (i == str1.length())
                        return false;
                }
            }
        }
        return false;
    }
}
