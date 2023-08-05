import java.util.*;
public class grades{
    public static void main(String arg[]){
        int a,b,c;
        Scanner sc= new Scanner (System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>50 && b>60 && c>100)
        {
            System.out.printf("10");
        }
        else if(a>50 && b>60)
        {
            System.out.printf("9");
        }
        else if(b>60 && c>100){
            System.out.printf("8");
        }
        else if(a>50 && c>100 )
        {
            System.out.printf("7");
        }
        else if ( a>50 || b>60 || c>100)
        {
            System.out.printf("6");
        }
        else{
            System.out.printf("5");
        }
    }
}