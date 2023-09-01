public class Friendly_pair_number {
    static int Divisorsum(int n1){
        int sum = 0;
        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0)
              sum = sum + i;
        }
        return sum;
    }
     
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 28;

        int sum1 = Divisorsum(n1);
        int sum2 = Divisorsum(n2);
        if(sum1 % n1 == sum2 % n2)
        System.out.println("this is friendly pair number");
        else
        System.out.println("this is not friendly pair number");
    }
}

