import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if(x%400==0)
            System.out.print("YES");
        else if(x%4==0 && x%100!=0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
