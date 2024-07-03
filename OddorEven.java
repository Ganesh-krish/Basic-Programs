import java.util.*;
class OddorEven{
public static void main(String[] a){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();

if( checkOddorEven(n)){
    System.out.println("the number "+n+" is even");
}
else{
 System.out.println("the number "+n+" is odd");
}
}

static boolean checkOddorEven(int num){
   
    return (num & 1) == 0;
}
}