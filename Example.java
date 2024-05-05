import java.util.LinkedList;

public class Example {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grapes");

        mergeSort(list);

        System.out.println("Sorted LinkedList: " + list);
    }

    private static void mergeSort(LinkedList<String> list) {
        if (list.size() <= 1) return; // base case

        LinkedList<String> leftList = new LinkedList<>();
        LinkedList<String> rightList = new LinkedList<>();

        int middle = list.size() / 2;
        for (int i = 0; i < middle; i++) {
            leftList.add(list.removeFirst());
        }
        while (!list.isEmpty()) {
            rightList.add(list.removeFirst());
        }

        mergeSort(leftList);
        mergeSort(rightList);
        merge(leftList, rightList, list);
    }

    private static void merge(LinkedList<String> leftList, LinkedList<String> rightList, LinkedList<String> list) {
        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            if (leftList.getFirst().compareTo(rightList.getFirst()) < 0) {
                list.add(leftList.removeFirst());
            } else {
                list.add(rightList.removeFirst());
            }
        }
        list.addAll(leftList);
        list.addAll(rightList);
    }
}
