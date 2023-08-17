class Solution {
    public int strStr(String haystack, String needle)
     {
         if (needle.length() == 0) {
            return 0;
        }
         if(haystack.length()<needle.length()){
             return -1;
         }
        for(int i=0;i<=haystack.length() - needle.length();i++){
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}