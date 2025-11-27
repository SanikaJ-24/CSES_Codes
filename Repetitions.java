import java.util.*;
public class Main{
   public int find_length(String s){
     int currlength=1;
     int maxlength=1;
     int i=1;
     while(i<s.length()){
     if(s.charAt(i)==s.charAt(i-1)){
      currlength++;
  }
else{
currlength=1;
}

maxlength=Math.max(currlength,maxlength);
i++;
}

return maxlength;
}
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);

     String s=sc.nextLine();
     Main ob=new Main();
     System.out.println(ob.find_length(s));
}
}