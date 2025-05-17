
public class vikas {
    public static int power(int a,int b){
        int ans =1;
        while (b>0){
            if((1&b)!=0){
                ans = ans*a;
            }
            a=a*a;
            b = b>>1;
        }
        return ans;
    }
    public static void main(String [] args){
        System.out.print(power(10, 5));        
    }
}
