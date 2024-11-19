import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        if((x+y)<=z)
            System.out.println("2");
        else if((x+y)>z && x<z)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
