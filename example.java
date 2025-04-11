import java.util.*;


public class java {
public static void PrimesinRange(int n){
    for (int i=1; i<=n; i++){
        if (n%i==0){
            System.out.println(i + " is a prime number ");
            
        }
       
    }
    
}

public static void main (String args[]){
    PrimesinRange(5);
}
}