public class last {
    public static int lastrec(int[] a, int key, int i){
        if(i==0){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return lastrec(a, key, i-1);
    }
    public static void main(String [] args){
        int [] arr = {10,2,5,8,6,56,8,4,94,3,12,5,8,9,4,55};
        int i=arr.length-1;
        int key = 5;
        System.out.print(lastrec(arr, key, i));
    }
}
