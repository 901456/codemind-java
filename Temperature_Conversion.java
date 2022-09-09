import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        double f,c;
        
        Scanner sc=new Scanner(System.in);
        
        c=sc.nextFloat();
        
        f=((float)(c*1.8))+32;
        
        System.out.format("%.2f",f);
        
        sc.close();
    }
}