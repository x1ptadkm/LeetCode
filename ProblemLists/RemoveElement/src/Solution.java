import java.util.Scanner;
import java.util.Arrays;

class Solution{
    public int removeElement(int[] nums, int val){
        int i=0;
        for(final int num:nums){
            if(num!=val)
                nums[i++]=num;
        }
        return i;
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String[] tokens=inp.nextLine().trim().split("\\s+");

        int val = Integer.parseInt(tokens[tokens.length-1]);
        int[] nums=new int[tokens.length-1];

        for(int i=0; i<tokens.length-1; i++){
            nums[i]=Integer.parseInt(tokens[i]);
        }
        
        Solution tester=new Solution();
        int newLength= tester.removeElement(nums, val);
        
        System.out.print(newLength);
        System.out.print(", nums = [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}