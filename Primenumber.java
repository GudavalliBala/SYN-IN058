/**
 * Primenuber
 */
import java.util.*;
public class Primenumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int factorCount=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
            {
                factorCount++;
            }
        }
        if (factorCount==2) {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}