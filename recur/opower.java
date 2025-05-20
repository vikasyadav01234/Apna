public class opower {
    public static int optimizepow(int n, int m){
        if (m==0) {
            return 1;
        }
        if(m%2==0){
            int half = optimizepow(n, m/2);
            return half*half;
        }
        else{
            return n*optimizepow(n, (m-1)/2);
        }
    }
    public static void main(String [] args){
        int n=10;
        int m = 100;
        System.out.print(optimizepow(n, m));
    }
}
