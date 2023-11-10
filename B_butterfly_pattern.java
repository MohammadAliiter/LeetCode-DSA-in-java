public class B_butterfly_pattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= 2*n-1; i++){
            for(int j = 1; j <= 2*n-1; j++){
                 
                if((i <= n && (j <= i || j >= 2*n-1 -i +1)) || i > n && (j >= i || j <= 2*n-1+1-i)){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
