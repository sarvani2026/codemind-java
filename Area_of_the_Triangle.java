import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float s,t;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s=(float)(a+b+c)/2;
        t=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",t);
    }
    
}
