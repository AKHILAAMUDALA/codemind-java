import java.util.*;
class PrettyNumbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int r,count;
        for(int i=1;i<=T;i++){
            int L=sc.nextInt();
            int R=sc.nextInt();
            count=0;
            for(int j=L;j<=R;j++){
                r=j%10;
                if(r==2||r==3||r==9)
                    count++;
            }
        
        System.out.println(count);
        }
    }
}
