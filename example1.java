import java.util.*;


public class example1 {
    public static void evenOdd(int n){
        if (n%2==0){
            System.out.println(n + " is an even number ");   
        }
        else{
            System.out.println(n + " is an odd number ");
        }
    }

    public static void main (String args[]){
        evenOdd(4);
    }
}
