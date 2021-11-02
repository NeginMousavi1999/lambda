import java.util.List;

/**
 * @author Negin Mousavi
 */
public class Test {
    public static void main(String[] args) {
        List<String> list1 = new java.util.ArrayList<>(List.of("ali", "taghi", "zahra", "sara", "zohre"));
        list1.forEach(System.out::println);
        System.out.println("****");
        List<String> list2 = new java.util.ArrayList<>(List.of("taghi", "zahra"));
/*        list1.removeAll(list2);
        list1.forEach(System.out::println);
        System.out.println("****");
        list1.removeIf(i -> i.length() == 3);
        list1.forEach(System.out::println);
        list1.retainAll(list2);
        System.out.println("****");*/
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) + "+");
        }
        list1.forEach(System.out::println);
    }
}
