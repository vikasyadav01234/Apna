public class asi {
    public static int facto(int n){
        int fact =1;
        if(n==0){
            return fact;
        }
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static int arrange(int n){
        int total = facto(n);
        return total;
    }
    public static void main(String[] args){
        int n=6;
        System.out.print(arrange(n));
    }
}
