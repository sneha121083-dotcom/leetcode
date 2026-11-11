import java.util.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        BigInteger n1=new BigInteger(a,2);
        BigInteger n2=new BigInteger(b,2);
        System.out.println(n1.add(n2).toString(2));
    }
}
