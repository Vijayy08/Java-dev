import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class newHashMap {
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();

        hm.put("a",10);
        hm.put("b",20);
        hm.put("c",30);

        System.out.println(hm);
        System.out.println("Size of map: "+ hm.size());
    }
}
