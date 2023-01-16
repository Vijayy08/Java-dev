import java.util.HashSet;

public class newHashset {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>(5);
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");
//        boolean r2=hs.add("a");
//        System.out.println(r2);
        hs.remove("c");
        System.out.println(hs);
        System.out.println("C in the collection? "+hs.contains("c"));
        for(String item : hs){
            System.out.println(item);
        }
    }
}
