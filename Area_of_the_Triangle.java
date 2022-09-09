import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        int a,b,c;
        float p,s;
        
        Scanner sc=new Scanner(System.in);
        
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        s=(float)(a+b+c)/2;
        p=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        
        System.out.format("%.2f",p);
        
        sc.close();
    }
}