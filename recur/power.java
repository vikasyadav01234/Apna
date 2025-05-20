public class power {
    public static int powermn(int n, int m){
        if(m==0){
            return 1;
        }

        return n*powermn(n, m-1);
    }
    public static void main(String [] args){
        int n=2;
        int m=40;
        System.out.print(powermn(n, m));
    }
}
