//14. Longest Common Prefix
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        for(int i1 = 0; i1 < strs[0].length(); i1++) {
            for (int i2 = 1; i2 < strs.length; i2++) {
                if(i1 >= strs[i2].length() || strs[i2].charAt(i1) != strs[0].charAt(i1)) return strs[0].subSequence(0, i1).toString();
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String strs[] = {"ccc3sahghjodoj-","ccc","caaaaaaaaa"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
}
