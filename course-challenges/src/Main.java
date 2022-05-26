import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Milan");
        linkedList.add("Rome");
        linkedList.add("Inter");
        linkedList.add("Venice");
        linkedList.add("Juventus");
        linkedList.add("Torino");
        linkedList.add("Barri");
        linkedList.add("Lazio");
        printList(linkedList);
        linkedList.add(1, "Bourgas");
        printList(linkedList);
    }

    private static void printList(LinkedList<String> linkedList) {
// variant 1
//        linkedList.forEach(System.out::println);

// variant 2
//        for (String element : linkedList) {
//            System.out.println(element);
//        }

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===============================================");
    }


}
