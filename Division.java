import java.util.Scanner;
class Multi
{
    public static void main(String args[])
    {
        int a,b;
        int m;
        
        Scanner sc=new Scanner(System.in);
        
        a=sc.nextInt();
        b=sc.nextInt();
        
        m=(a/b);
        
        System.out.println(m);
        
        sc.close();
    }
}