import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(Str.substring(start,end));
    }
}
