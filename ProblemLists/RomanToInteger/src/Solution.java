public class Solution {
  public int romanToInt(String s) {
    int ans = 0;
    int[] roman = new int[128];

    roman['I'] = 1;
    roman['V'] = 5;
    roman['X'] = 10;
    roman['L'] = 50;
    roman['C'] = 100;
    roman['D'] = 500;
    roman['M'] = 1000;

    for (int i = 0; i + 1 < s.length(); ++i)
      if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
        ans -= roman[s.charAt(i)];
      else
        ans += roman[s.charAt(i)];

    return ans + roman[s.charAt(s.length() - 1)];
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    String roman1 = "III";
    String roman2 = "IV";
    String roman3 = "IX";
    String roman4 = "LVIII";
    String roman5 = "MCMXCIV";

    System.out.println(roman1 + " = " + solution.romanToInt(roman1)); // 3
    System.out.println(roman2 + " = " + solution.romanToInt(roman2)); // 4
    System.out.println(roman3 + " = " + solution.romanToInt(roman3)); // 9
    System.out.println(roman4 + " = " + solution.romanToInt(roman4)); // 58
    System.out.println(roman5 + " = " + solution.romanToInt(roman5)); // 1994
  }
}
