import java.util.Scanner;
public class apple{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s,t;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)*0.5f;
        t=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",t);
    }
}