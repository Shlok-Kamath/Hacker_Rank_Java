import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            String ans="";
            for(int j=1; j<n+1 ; j++){
                int intermidiate=a;
                for(int k=0 ; k<j ; k++){
                    intermidiate+=Math.pow(2,k)*b;
                }
                ans+=intermidiate+" ";
    
            }
            System.out.println(ans.trim());
        }
        in.close();
        
    }
}
