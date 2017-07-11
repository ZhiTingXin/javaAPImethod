import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by lenovo on 2017/7/11.
 */
public class hashtable1 {
    //hashtable extends dictionary implements map
    public static void main(String args[]){
        Hashtable hashtable = new Hashtable();
        Hashtable h = new Hashtable();
        h.put("one","two");
        h.put("h","da");
        h.put(1,2);
        h.put(1.02,2.03);
        hashtable.put("one","two");
        hashtable.put("h","da");
        hashtable.put(1,2);
        hashtable.put(1.02,2.03);
        System.out.println(hashtable.equals(h));
        System.out.println(hashtable.contains("two"));

        //contains is the same with containsvalue in function
        System.out.println(hashtable.containsValue(2.03));

        for (Enumeration e = hashtable.elements(); e.hasMoreElements();)
            System.out.println(e.nextElement());

        //others are the same with hashmap


    }
}
