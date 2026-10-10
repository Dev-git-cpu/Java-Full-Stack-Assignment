import java.util.*;

public class Collection{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dev");
        list.add("Sonone");

        Set<String> set = new HashSet<>();
        set.add("Dev");
        set.add("Dev");

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Dev");
        map.put(2,"Sonone");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}