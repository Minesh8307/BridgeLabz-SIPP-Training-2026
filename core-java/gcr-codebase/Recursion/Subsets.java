import java.util.ArrayList;

public class Subsets {

    static void subsets(int[] arr, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            System.out.println(list);
            return;
        }

        subsets(arr, index + 1, list);

        list.add(arr[index]);

        subsets(arr, index + 1, list);

        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2};

        subsets(arr, 0, new ArrayList<>());
    }
}