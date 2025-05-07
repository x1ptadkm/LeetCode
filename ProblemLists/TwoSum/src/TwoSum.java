import java.util.Scanner;

class TwoSum{
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target)
                    return new int[] {i, j};
            }
        }
        throw new IllegalArgumentException();
    }
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String[] tokens=inp.nextLine().trim().split("\\s+");

        int target = Integer.parseInt(tokens[tokens.length-1]);
        int[] nums=new int[tokens.length-1];

        for(int i=0; i<tokens.length-1; i++){
            nums[i]=Integer.parseInt(tokens[i]);
        }

        TwoSum solver=new TwoSum();
        
        try{
            int[] res=solver.twoSum(nums, target);
            System.out.println(res[0] + " " + res[1]);
        } catch(IllegalArgumentException e){
            System.out.println("-1 -1");
        }
    }
} 

