public class merge {

    public static void marge(int arr[], int si, int mid, int ei){
        int temp[] = new int [ei-si+1];
        int i = si;
        int j = mid +1;
        int k=0;
        while (i<=mid&& j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements of 1st sorted part
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        //for left over elements of 2nd sorted part
        while (j<=ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to orignal array
        for(k=0,i=si;k<temp.length;k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void margesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        margesort(arr, si, mid);
        margesort(arr, mid+1, ei);

    }
    public static void main(String [] args){
        int[] a = {1,3,0,34,23,12,44,2,4,5,43};

    }
}