import java.util.*;
public class Main{
public long find(long n,long[] nums){
   long totalsum= (long)(n*(n+1))/2;
   for(int i=0;i<nums.length;i++){
    totalsum=totalsum-nums[i];
}
return totalsum;
}

public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long[] nums=new long[n-1];

  for(int i=0;i<n-1;i++){
   nums[i]=sc.nextLong();
}
  Main ob=new Main();
  System.out.println(ob.find(n,nums));
}
}
