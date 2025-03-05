import java.util.*;
public class Containsduplicate {
        public static boolean containsDuplicath(int[] nums) {
            boolean flag = false;
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        flag=true;
                        break;
                    }
                }
            }
            return flag;
        }
        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            int nums[]=new int[4];
            for(int i=0;i<4;i++){
                nums[i]=sc.nextInt();
            }
            System.out.print(containsDuplicath(nums));
        }
    
}
