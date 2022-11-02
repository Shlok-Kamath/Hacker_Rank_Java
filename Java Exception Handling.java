import java.util.Scanner;

class Except_negative extends Exception{
    public String toString(){
        return "java.lang.Exception: n or p should not be negative.";
    }
    
    public String getMessage(){
        return "java.lang.Exception: n or p should not be negative.";
    }
}

class Except_null extends Exception{
    public String toString(){
        return "java.lang.Exception: n and p should not be zero.";
    }
    
    public String getMessage(){
        return "java.lang.Exception: n and p should not be zero.";
    }
}

class MyCalculator {
    
    long power(int n, int p) throws Exception{
        if(n<0 || p<0){
            throw new Except_negative();
        }
        else if(n==0 && p==0){
            throw new Except_null();
        }
        else{
            int a=1;
            for(int i=0 ;i<p; i++){
                a*=n;
            }
            return a;
        }
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
