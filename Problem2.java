public class Problem2 {
    static int sumRect(int n){
        if(n==1){
            return 1;
        }
          else{
            return n + sumRect(n-1);
          }             


    }
    public static void main(String[] args) {
        System.out.println(sumRect(3));
        
    }
}
