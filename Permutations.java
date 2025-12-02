import java.util.Scanner;

public class Main {
    public void permutations(int n){
        if(n==1){
            System.out.println(1);
        }

        if(n==2 || n==3){
            System.out.println("NO SOLUTION");
        }
        StringBuilder sb=new StringBuilder();
        if(n>3){
            for(int i=2;i<=n;i+=2){
                sb.append(i).append(" ");
            }
            for(int i=1;i<=n;i+=2){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Main ob=new Main();
        ob.permutations(n);
    }

}
