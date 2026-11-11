import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int temp=n;
        while(n>0){
            if(temp%(n%10)==0){
                cnt+=1;
            }
            n/=10;
        }
        System.out.println(cnt);
    }
}
