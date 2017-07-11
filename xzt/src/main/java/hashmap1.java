import java.util.HashMap;

/**
 * Created by lenovo on 2017/7/10.
 * extends abstractmap implements map,and map's keys and values are classes,int will be wrong
 */
public class hashmap1 {
    public static void main(String args[]){
        HashMap<Integer,Integer> hash = new HashMap<Integer, Integer>();
        hash.put(1,2);
        //add tuples throw put
        System.out.println(hash.containsKey(1));
        //是否包含这个键
        System.out.println(hash.containsValue(2));
        //是否包含这个值
        hash.clear();
        System.out.println(hash.size());
        hash.put(1,2);
        hash.put(2,3);
        hash.putIfAbsent(3,4);
        hash.remove(2);
        System.out.println(hash.values());//collections
        System.out.println(hash.keySet());
        System.out.println(hash.replace(1,2,9));
        // 如果之前是没有值的那么就会替换失败

        System.out.println(hash.keySet());//set
    }
}
