import java.util.*;

public class Main{
    public void find_sequence(ArrayList<Long> ans,long num){
        ans.add(num);
        if(num==1)return;
        else if(num%2==0){
            num=num/2;
            find_sequence(ans,num);
        }
        else if(num%2!=0){
            num= num*3 +1;
            find_sequence(ans,num);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long inputnum=sc.nextLong();
        Main ob=new Main();
        ArrayList<Long> li=new ArrayList<>();
        ob.find_sequence(li,inputnum);

        for(long i:li){
            System.out.print(i +" ");
        }
    }

     
}
