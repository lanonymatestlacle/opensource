import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
