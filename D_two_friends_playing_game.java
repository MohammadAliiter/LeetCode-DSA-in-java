public class D_two_friends_playing_game {
        public static int findNextDistinctNumber(int num) {
            while (true) {
                num++;
                if (areDigitsDistinct(num)) {
                    return num;
                }
                else{
                    return -1;
            
            }
        }
    }
    
        private static boolean areDigitsDistinct(int num) {
            int[] digitCount = new int[10];
            while (num > 0) {
                int digit = num % 10;
                if (digitCount[digit] > 0) {
                    return false; // Duplicate digit found
                }
                digitCount[digit]++;
                num /= 10;
            }
            return true; // All digits are distinct
        }
    
        public static void main(String[] args) {
            // Example usage:
            int friend1Number =2345;
            int result = findNextDistinctNumber(friend1Number);
            System.out.println(result);
        }
    }

