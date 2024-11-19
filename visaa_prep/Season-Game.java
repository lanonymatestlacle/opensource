import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==3||n==4||n==5)
            System.out.println("Spring");
        else if(n>=6 && n<=8)
            System.out.println("Summer");
        else if(n>=9 && n<=11)
            System.out.println("Autum");
        else if(n==2||n==1||n==2)
            System.out.println("Winter");
        else
            System.out.println("Invalid");
    }
}
