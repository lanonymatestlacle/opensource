import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int y=s.nextInt();
        if(y%x==0)
            System.out.println("YES");
        else
            System.out.print("NO");
    }
}
