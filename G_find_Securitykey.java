 import java.util.HashMap;
import java.util.Map;

public class G_find_Securitykey {

    public static void main(String[] args) {
        // Example input
        int inputData = 12134224;
        
        // Calculate and print the security key
        int securityKey = calculateSecurityKey(inputData);
        System.out.println(securityKey);
    }

    public static int calculateSecurityKey(int inputData) {
        // Convert the integer to a string for easier digit manipulation
        String dataString = String.valueOf(inputData);

        // Map to store the count of each digit
        Map<Character, Integer> digitCountMap = new HashMap<>();

        // Loop through each digit in the string and update the count in the map
        for (char digit : dataString.toCharArray()) {
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
        }

        // Count the unique repeating digits (digits with count > 1)
        int uniqueRepeatingDigits = 0;
        for (int count : digitCountMap.values()) {
            if (count > 1) {
                uniqueRepeatingDigits++;
            }
        }

        return uniqueRepeatingDigits;
    }
}

