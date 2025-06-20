package arraylist;

import java.util.List;
import java.util.Vector;

public class vector1 {
    public static void main(String[] args){
        int n=10;
        List<Integer> list=new Vector<>(n);
        for(int i=0;i<=n;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
