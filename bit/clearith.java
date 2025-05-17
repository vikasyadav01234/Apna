public class clearith {
    public static int clearlastith(int a, int b){
        int bit = (~0)<<b;
        return a&bit;
    }
    public static void main(String [] args){
        System.out.print(clearlastith(15, 2));
    }
}
