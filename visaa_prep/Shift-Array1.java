import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int x=a[0];
        for(int i=1;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(x);
    }
}
