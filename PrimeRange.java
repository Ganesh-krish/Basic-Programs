import java.util.*;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range:");
        int start = sc.nextInt();
        System.out.println("Enter the ending range:");
        int end = sc.nextInt();
        
        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> nonPrimeNumbers = new ArrayList<>();
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i, 2)) {
                primeNumbers.add(i);
            } else {
                nonPrimeNumbers.add(i);
            }
        }
        
        // Convert lists to arrays
      //  int[] primeArray = primeNumbers.stream().mapToInt(Integer::intValue).toArray();
        //int[] nonPrimeArray = nonPrimeNumbers.stream().mapToInt(Integer::intValue).toArray();
        
        // Print prime numbers
        System.out.println("Prime Numbers:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
        System.out.println();
        
        // Print non-prime numbers
        System.out.println("Non-Prime Numbers:");
        for (int nonPrime : nonPrimeNumbers) {
            System.out.print(nonPrime + " ");
        }
        System.out.println();
        
        sc.close();
    }

    static boolean isPrime(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }
}
