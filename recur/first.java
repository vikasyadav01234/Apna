public class first {
    public static int firstocur(int[] a, int key,int i){
        
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstocur(a, key,i+1);
    }
    public static void main(String [] args){
        int [] arr = {10,2,5,8,6,56,8,4,94,3,12,5,8,9,4,55};
        int i=0;
        int key = 5;
        System.out.print(firstocur(arr, key, i));
    }
}
