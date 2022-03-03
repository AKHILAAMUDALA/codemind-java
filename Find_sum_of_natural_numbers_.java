import java.util.*;
class SumOfNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int res=(N*(N+1))/2;
        System.out.println(res);
    }
}