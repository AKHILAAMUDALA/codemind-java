import java.util.*;
class Square{
    static boolean checkPerfectSquare(int n)    
{   
    double sqrt=Math.sqrt(n);   
    return ((sqrt - Math.floor(sqrt)) == 0);   
}   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (checkPerfectSquare(n))   
            System.out.print("True");   
        else  
            System.out.print("False");   
    }
}