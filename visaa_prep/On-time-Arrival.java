import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int x=s.nextInt();
            if(x<30)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
