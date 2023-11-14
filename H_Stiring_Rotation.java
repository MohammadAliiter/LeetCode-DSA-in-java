public class H_Stiring_Rotation {

        public static boolean areRotations(String s1, String s2) {
            // Check if lengths of both strings are equal
            if (s1.length() != s2.length()) {
                return false;
            }
    
            // Concatenate s1 with itself
            String temp = s1 + s1;
    
            // Check if s2 is a substring of the concatenated string
            return temp.contains(s2);
        }
    
        public static void main(String[] args) {
            // Example usage:
            String s1_example1 = "geeksforgeeks";
            String s2_example1 = "forgeeksgeeks";
            System.out.println(areRotations(s1_example1, s2_example1));  // Output: true
    
            String s1_example2 = "mightandmagic";
            String s2_example2 = "andmagicmigth";
            System.out.println(areRotations(s1_example2, s2_example2));  // Output: false
        }
    }
    

