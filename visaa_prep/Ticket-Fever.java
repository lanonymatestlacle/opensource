import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int m=s.nextInt();
            if(n>m){
                System.out.println(n-m);
            }
            else{
                System.out.println("0");
            }
        }
    }
}
