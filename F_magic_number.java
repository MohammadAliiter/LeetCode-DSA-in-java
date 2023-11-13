public class F_magic_number {
        static Boolean isprefectsquare(int num){
                    int sqrt = (int)Math.sqrt(num);
                    
                    return sqrt*sqrt == num;
          }
          
                   static int findmagicNumber(int N , int arr[]){
                     int count = 0;
                     
                     for(int i = 0; i <N; i++){
                       if(isprefectsquare(arr[i]))
                       count++;
                       
                     }
                     
                     return count;
                     
                   }
            public static void main(String[] args) {
            
              int arr[] = {55,1,0,64,25};
              int n = arr.length;
              int result = findmagicNumber(n,arr);
              System.out.print(result);
          }
        }
    
    

