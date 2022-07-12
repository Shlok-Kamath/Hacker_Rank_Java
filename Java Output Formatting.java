import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int s1_length=s1.length();
                //Complete this line
                String b = String.format("%03d", x);
                for(int j=0;j<15-s1_length;j++){
                    s1+=' ';
                }
                System.out.println(s1+b);
            }
            System.out.println("================================");

    }
}
