public class Recursion {
    static int fac(int m){
        if (m==0 || m==1){
            return 1;
    }
    else{
        return m*fac(m-1);
    }
}
    static int fac_itrative(int n){

    if (n==0 || n==1){
        return 1;
    }
    else{
        int product= 1;
    for(int i = 1 ; i<=n ;i++){
        product = product * i;
    }
return product;
}
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        System.out.println(fac_itrative(x));
        System.out.println(fac(y));
    }
    }
