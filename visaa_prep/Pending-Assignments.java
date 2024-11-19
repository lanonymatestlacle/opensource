import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        if((x*y)<=(z*24*60))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
