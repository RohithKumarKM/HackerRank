import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {
        if(a.length()!=b.length()) 
            return false;
        else
        {
            char[] a1 = a.toLowerCase().toCharArray();
            char[] b1 = b.toLowerCase().toCharArray();

            int count[] = new int[26];

            int n = a1.length;
            int m = b1.length;

            if(n != m)
                return false;

            for(int i=0;i<n;i++)
            {
                count[a1[i]-97]++;
                count[b1[i]-97]-- ;
            }
            for(int i=0;i<26;i++)
            {
                if (count[i] != 0)
                    return false;
            }
            return true;
        }
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
