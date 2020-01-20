import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";

        int length = A.length();

        for ( int i = length - 1; i >= 0; i-- )
         B = B + A.charAt(i);

        if(A.equals(B)) System.out.println("Yes");
        else System.out.println("No");
    }
}
