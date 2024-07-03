import java.util.*;
public class Prime3{
    public static void main(String[] args){
       Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
       boolean isPrime = true;
    
       if (n < 2){
        isPrime = false;
       }
       else{
        for(int i = 2;i<=n/2;i++){
            if( n % i == 0){
                isPrime = false;
                break;
            }
        }
        
       }
       String res = isPrime ? "Prime ":"Not Prime";
       System.out.println(n+"is "+res+"number");
    }
     
    }