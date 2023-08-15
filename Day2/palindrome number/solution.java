class Solution {
   public static void main(String[] args) {
        int x = 11211;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }

    static boolean isPalindrome(int x) {
        int sum = 0;
        int r;
        int t = x;
        while (x > 0) {
            r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;

        }
        if (t == sum) {

            return true;
        }
        return false;


    }

}