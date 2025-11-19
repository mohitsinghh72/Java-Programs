public class SumOfDigitRecursion {
    public static void main(String[] args) {
        int ans = sumOfDigit(5423,0);
        System.out.println(ans);
    }
    static int sumOfDigit(int n,int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        count = count+rem;
        return sumOfDigit(n/10,count);
    }
}