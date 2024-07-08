package TcsDigitalCode;

import java.util.ArrayList;
import java.util.List;

public class FindSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 1, 5, 6};
        int k = 6;
        List<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int reqsum = 0;
            ArrayList<Integer> subArrayList = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                reqsum += arr[j];
                subArrayList.add(j);
                if (reqsum == k) {
                    System.out.println(reqsum);
                    res.add( new ArrayList<>(subArrayList));
                }
            }
        }
        System.out.println(res);
    }
}


