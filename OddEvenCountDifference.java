import java.util.*;

public class OddEvenCountDifference {
  static int countOddEvenDifference(int arr[], int n){
    int cOdd = 0;
    int Ceven =0;
    for(int i = 0; i<n; i++){
      if(arr[i] % 2 == 0){
        Ceven++;
      }
      else{
        cOdd++;
    }
    }
    return cOdd-Ceven;
  }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i<n; i++){
        arr[i]= sc.nextInt();
      }
    int result =   countOddEvenDifference(arr,n);
    System.out.print(result);
      
  }
}