import java.util.Scanner;
class Multi
{
    public static void main(String args[])
    {
        int n,m;
        
        Scanner sc=new Scanner(System.in);
        
        n=sc.nextInt();
        
        m=((n*(n-1))/2);
        
        System.out.println(m);
        
        sc.close();
    }
}