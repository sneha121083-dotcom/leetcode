import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cnt=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lim=Math.min(a,b);
        for(int i=1;i<=lim;i++){
            if(a%i==0 && b%i==0){
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
}
