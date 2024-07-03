import java.util.*;
public class Prime1{
    public static void main(String[] args){
       Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
       checkPrime(n);
    }
    public static void checkPrime(int num){
        int count = 0;
        if(num<2){
            System.out.println(num+"is not a prime");
        }
        for(int i = 1;i<num;i++){
            if(num%i == 0){
            count += 1;
            }
        }
      if(count>2 ){
        System.out.println(num+"is not prime");
      }
      else{
        System.out.println(num+"is prime"); 
      }
    }
}