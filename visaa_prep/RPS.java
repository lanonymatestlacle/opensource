import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        char v=a.charAt(0);
        char c=b.charAt(0);
        if(v==c)
            System.out.println("NULL");
        else if((v=='P' && c=='R')||(v=='S' && c=='P')||(v=='R' && c=='S'))
                System.out.println("Vignesh");
        else
                System.out.println("Charan");
    }
}
