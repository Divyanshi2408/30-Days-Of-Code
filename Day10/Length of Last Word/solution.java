class Solution {
    public int lengthOfLastWord(String s) {
         String str = s.trim();
         s=s.trim();
         int count=0;
         int i = s.length()-1;
         while(i >= 0 && str.charAt(i)!=' '){
            count++;
            i--;
        } return count;
    }
}
