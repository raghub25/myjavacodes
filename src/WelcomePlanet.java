import java.util.*;
import java.util.stream.Stream;

public class WelcomePlanet {
//    public static void main(String[] args) {
////        Stream.of("d2","a2","b1","b3","c").map(s->{
////            System.out.println("map: "+s); return s.toUpperCase();
////        }).anyMatch(s-> {System.out.println("anymatch: "+s); return s.startsWith("A");});
//        TreeSet<Integer> tree = new TreeSet<>();
//        tree.add(2);
//        tree.add(3);
//        tree.add(7);
//        tree.add(5);
//        SortedSet<Integer> sort = tree.subSet(1,7);
//        sort.add(4);
//        sort.add(6);
//        for(Integer i:sort){
//            System.out.println(i);
//        }
//    }

    public static void main(int[] args) {
        System.out.println("a");
    }

    public static void main(String[][] args) {
        System.out.println("b");
    }

    public static void main(String... args) {
//        System.out.println("c");
//        Set hashset = new HashSet();
//        hashset.add("One");
//        hashset.add("Two");
//        hashset.add("Three");
//        hashset.add("Four");
//        hashset.add("One");
//        hashset.add("Four");
//        List list = new ArrayList<>();
//        list.add("One");
//        list.add("Two");
//        list.add("Three");
//        hashset.retainAll(list);
//        System.out.println("Size: "+list.size()+hashset.size());
//        float f[] =new float[5];
//        Object o = f;
//        System.out.println(f[0]);
//        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
//        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
//        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
//        Hello h = new Hello();
//        h.showNumber();
//        boolean i = false;
//        if(i=true){
//            System.out.println("a");
//        }
//        else{
//            System.out.println("b");
//        }
//        Thread t =new Thread() {
//            Hello h = new Hello();
//
//            public void run() {
//                h.increase(20);
//            }
//        };
//        t.start();
//        }
        System.out.println(increase());
    }

    public static synchronized int increase() {
        try {
            return 3;
        } catch (Exception e) {
            return 2;
        } finally {
            return 1;
        }
    }
}