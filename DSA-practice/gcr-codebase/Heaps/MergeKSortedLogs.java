import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLogs {

    
    static class Node {
        int value;
        int listIndex;
        int elementIndex;

        Node(int value, int listIndex, int elementIndex) {
            this.value = value;
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }
    }

    
    static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {

        PriorityQueue<Node> minHeap =
                new PriorityQueue<>((a, b) -> a.value - b.value);

       
        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(i).isEmpty()) {
                minHeap.offer(new Node(lists.get(i).get(0), i, 0));
            }
        }

        List<Integer> mergedList = new ArrayList<>();

        while (!minHeap.isEmpty()) {

            Node current = minHeap.poll();
            mergedList.add(current.value);

            int nextIndex = current.elementIndex + 1;

            if (nextIndex < lists.get(current.listIndex).size()) {
                minHeap.offer(new Node(
                        lists.get(current.listIndex).get(nextIndex),
                        current.listIndex,
                        nextIndex
                ));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {

        List<List<Integer>> logs = new ArrayList<>();

        logs.add(Arrays.asList(1, 4, 7, 10));
        logs.add(Arrays.asList(2, 5, 8, 11));
        logs.add(Arrays.asList(3, 6, 9, 12));

        List<Integer> result = mergeKSortedLists(logs);

        System.out.println("Merged Sorted Logs:");
        System.out.println(result);
    }
}