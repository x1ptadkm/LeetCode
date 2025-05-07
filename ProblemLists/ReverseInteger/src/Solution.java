import java.util.Scanner;

class Solution{
    public int reverse(int x){
        long ans=0;
        while(x!=0){
            ans=ans*10+x%10;
            x/=10;
        }
        return(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE) ? 0 : (int)ans;
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int x=inp.nextInt();
        
        Solution tester=new Solution();
        int reversedNum=tester.reverse(x);
        System.out.println(reversedNum);
    }
}
