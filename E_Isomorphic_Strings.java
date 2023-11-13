import java.util.HashMap;
public class E_Isomorphic_Strings {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Boolean> usedChars = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (map.containsKey(char1)) {
                if (map.get(char1) != char2) {
                    return false; // Mapping conflict
                }
            } else {
                if (usedChars.containsKey(char2)) {
                    return false; // Multiple characters mapping to the same character in str2
                }
                map.put(char1, char2);
                usedChars.put(char2, true);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        System.out.println(areIsomorphic(str1, str2)); // Output: true

        str1 = "aab";
        str2 = "xyz";
        System.out.println(areIsomorphic(str1, str2)); // Output: false
    }
}


