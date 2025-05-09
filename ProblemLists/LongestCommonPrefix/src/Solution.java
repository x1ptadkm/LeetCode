import java.util.Scanner;

class Solution{
  public String longestCommonPrefix(String[] strs){
    if(strs.length==0)
      return "";

    for(int i=0; i < strs[0].length(); ++i)
      for(int j=1; j < strs.length; ++j)
        if(i==strs[j].length() || strs[j].charAt(i)!=strs[0].charAt(i))
          return strs[0].substring(0, i);

    return strs[0];
  }

  public static void main(String[] args){
    Scanner inp=new Scanner(System.in);
    Solution tester=new Solution();

    System.out.print("strs =  ");
    int n=Integer.parseInt(inp.nextLine());
    String input=inp.nextLine().trim();

   // Loại bỏ dấu ngoặc và tách chuỗi
    input=input.replaceAll("^\\[|\\]$", ""); // Xóa [ và ]
    String[] strs = input.split("\",\\s*\"");

    // Xử lý nếu người dùng nhập dấu " ở đầu/cuối
    for (int i = 0; i < strs.length; ++i) {
      strs[i] = strs[i].replaceAll("^\"|\"$", ""); // xóa dấu " nếu còn
    }

    String prefix=tester.longestCommonPrefix(strs);
    System.out.println(prefix);
  }
}
