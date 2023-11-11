public class C_sum_of_binary_number {
    public static void main(String[] args) {
        int binary = 1111;
        int sum = 0;

        while(binary != 0){

            int digit = binary % 10;
            sum += digit;
            binary = binary/10;
        }
        System.out.println(sum);
    }
}
