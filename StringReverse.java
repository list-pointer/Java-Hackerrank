import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char[] ans=a.toCharArray();
        int ab=1;
        int j=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            if(a.charAt(j) != ans[i])
            {ab=0;}
            j++;
        }
        if(ab == 1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



