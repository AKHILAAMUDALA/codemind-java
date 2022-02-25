import java.util.*;
class Average{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        float M=sc.nextInt();
        //M=float(M);
        double a=(N+M)/2;
        System.out.printf("%.4f",a);
    }
}