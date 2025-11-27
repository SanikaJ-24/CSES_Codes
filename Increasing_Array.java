import java.util.*;
public class Main{
    public long moves(int n, long[] arr){
        long total_moves=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                total_moves=total_moves + arr[i-1]-arr[i];
                long diff= (long)arr[i-1]-arr[i];
                arr[i]=arr[i]+diff;
            }

        }
        return total_moves;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();

        }
        Main ob=new Main();
        System.out.println(ob.moves(n,arr));
    }
}