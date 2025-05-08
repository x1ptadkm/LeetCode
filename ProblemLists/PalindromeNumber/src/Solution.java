import java.util.Scanner;

class Solution{
    public static boolean isPalindrome(int x){
    //public boolean isPalindrome(int x){
        if(x<0) return false;
        
        long ans=0;
        int y=x;
        
        while(y>0){
            ans=ans*10+y%10;
            y/=10;
        }
        
        return ans==x;
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int x=inp.nextInt();
        
        //Solution tester=new Solution();
        //System.out.println(tester.isPalindrome(x));
        System.out.println(isPalindrome(x));
    }
}