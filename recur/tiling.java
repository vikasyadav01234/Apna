public class tiling {
    public static int tili(int n, int m){
        int ways =0;
        if(m==0){
            return 1;
        }
        if(m==1){
            return 1;
        }
        if(m==2){
            return 2;
        }
        ways= tili(n, m-1)+tili(n, m-2);
        return ways;
    }
    public static void main(String [] args){
        int n=2;
        int m=3;
        System.out.print(tili(n, m));
    }
}
