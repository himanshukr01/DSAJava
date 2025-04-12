import java.util.*;

public class IsPalindrome {
    public static void IsPalindrome(int n) {
        for (int i=0; i<n; i++){
            for (int j=n; j>0; j--){
                if (i==j){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("Not a palindrome");
                }
            }
    }
}
    public static void main (String args[]){
        IsPalindrome(1234);
    }

}