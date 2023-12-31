
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shuffle_Array {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert it back to an array if needed
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(shuffledArray));
    }
}