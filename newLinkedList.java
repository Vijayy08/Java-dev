import java.util.LinkedList;

public class newLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ls=new LinkedList<String>();
        ls.add("A");
        ls.add("B");
        System.out.println(ls);

        ls.addFirst("C");
        System.out.println(ls);

        ls.addLast("S");
        System.out.println(ls);

        ls.remove(3);
        System.out.println(ls);
    }
}
