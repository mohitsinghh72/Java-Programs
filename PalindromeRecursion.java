public class PalindromeRecursion {
    public static void main(String[] args) {
        boolean ans = palindrome(123221);
        System.out.println(ans);
    }
    static int reverse(int n,int rev){
        if(n == 0){
            return rev;
        }
        int rem = n%10;
        rev = rev*10+rem;
        return reverse(n/10,rev);
    }
    static boolean palindrome(int n){
        return n == reverse(n, 0);

    }
}