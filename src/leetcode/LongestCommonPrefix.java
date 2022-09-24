package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String commonPrefix = "";

        for (int i=0; i<strs.length;i++){
            String temp = "";
            if(i==0){
                temp = strs[0];
            }else{
                temp = commonPrefix;
            }

            commonPrefix = "";
            int index = 0;
            int min = Math.min(temp.length(), strs[i].length());

            while (index < min){
                if (temp.charAt(index)==strs[i].charAt(index)){
                    commonPrefix += temp.charAt(index);
                }else {
                    break;
                }
                index++;
            }
        }

        return commonPrefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings = new String[2];
        strings[0] = "ab";
        strings[1] = "a";
//        strings[2] = "flight";
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));
    }
}
