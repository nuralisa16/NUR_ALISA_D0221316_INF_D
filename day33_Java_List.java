import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> List = new ArrayList<>();
        for(int i=0;i<n;i++){
            int element = sc.nextInt();
            List.add(element);
        }
        
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String query = sc.next();
            if(query.equals("Delete")){
                int x = sc.nextInt();
                List.remove(x);
            }else if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();//value yang ditambahkan
                List.add(x, y);
            } 
        }
        
        //cetak
        for(int value : List){
            System.out.print(value+" ");
        }
    }
}
