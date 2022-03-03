import java.util.*;
class Area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double A=sc.nextInt();
        double B=sc.nextInt();
        double C=sc.nextInt();
        double s=(A+B+C)/2;
        double area=Math.sqrt(s*(s-A)*(s-B)*(s-C));
        System.out.println(String.format("%.2f",area));
    }
}