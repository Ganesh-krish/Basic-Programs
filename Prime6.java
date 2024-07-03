public class Prime6 {
    public static void main(String[] args) {
        int n = 29;
        int i = 2;
        boolean res = isPrime(n, i); // Add missing semi-colon at the end
        if (res)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");
    }

    static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        } else if (n == i) {
            return true;
        } else if (n % i == 0) {
            return false;
        }
        
        i++;
        return isPrime(n, i); // Move outside the if-else blocks
    }
}
