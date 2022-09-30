import java.util.Scanner;
class Inttttt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,r,t,n,si;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        
        n=p*r*t;
        si=(int)n/100;
        System.out.println(si);
    }
}
