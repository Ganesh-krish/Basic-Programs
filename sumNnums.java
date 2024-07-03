import java.util.*;
class sumNnums{
public static void main(String[] args){
int a =10;
int b = 20;
int res = sumofN(a,b);
System.out.println(res);
}

static int sumofN(int i,int b){
    if (i > b){
        return 0;
    }
    return i + sumofN(i+1,b);
}
}