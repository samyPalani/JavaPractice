package arraylist;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
* ArrayList:
* TimeComplexity:
* Adding an element in list: O(1)
* Traverse or Search an element in unstored list : O(n)
* Sorted List: O(log n)
* Inserting and deleting: O(n)
*
*
*
*
*
* */
public class ArrayList1 {
    public static void main(String[] args){
       /* List<Integer> ar=new ArrayList<>();
        ar.add(1);

        System.out.println(ar);*/

        Collection<Integer> numbers= IntStream.range(0,10).boxed().collect(Collectors.toSet());
       /* List<Integer> listnum=new ArrayList<>(numbers);
        System.out.println(listnum);*/

        List<Integer> strlist=new ArrayList<>(5);


        strlist.add(77);
        strlist.add(72);
        strlist.add(76);
        strlist.add(79);

     }

    }

