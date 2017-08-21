import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int T,start,end,sum,max,N,temp;
        int cas = 1;
        int a[] = new int[100010];

        T = cin.nextInt();
        while( T-->0 ){
            N = cin.nextInt();
            max = -1001;
            start=end=temp=1;
            sum = 0;
            for (int i=1;i<=N;i++){
                a[i]=cin.nextInt();
                sum += a[i];
                if (sum > max){
                    max = sum;
                    start = temp;
                    end = i;
                }
                if( sum<0 ){
                    sum = 0;
                    temp=i+1;
                }
            }

            System.out.printf("Case %d:\r\n",cas++);
            System.out.printf("%d %d %d\r\n",max,start,end);
            if (T>0){
                System.out.println();
            }
        }
    }
}