public class Palindrome {
        public boolean isPalindrome(int x) {
            int rev = 0;
            if (x < 0)
                return false;
            int xOrig = x;
            while (x != 0){
                rev = (rev*10) + (x%10);
                x = x/10;
            }
            if(rev == xOrig)
                return true;
            else
                return false;
        }
}
