import java.util.Scanner;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";

    for (int i = 0; i < strs[0].length(); ++i)
      for (int j = 1; j < strs.length; ++j)
        if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
          return strs[0].substring(0, i);

    return strs[0];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Solution solution = new Solution();

    System.out.print("Nhập số lượng chuỗi: ");
    int n = Integer.parseInt(scanner.nextLine());
    String[] strs = new String[n];

    for (int i = 0; i < n; ++i) {
      System.out.print("Chuỗi thứ " + (i + 1) + ": ");
      strs[i] = scanner.nextLine();
    }

    String prefix = solution.longestCommonPrefix(strs);
    System.out.println("Tiền tố chung dài nhất là: \"" + prefix + "\"");

    scanner.close();
  }
}
