import java.util.ArrayList;
public class newArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<Integer>(5);
        for(int i=0;i<5;i++){
            a.add(i);
        }
        System.out.println(a);

//        a.remove(4);
//
//        System.out.println(a);

        a.add(6);

        System.out.println(a);
    }
}
