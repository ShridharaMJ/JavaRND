package hackerRankSolution;

import org.testng.annotations.Test;

import java.util.*;

public class ArrayBased {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> match = new ArrayList<>();
        for (String value : queries) {
            String value1 = String.valueOf(strings.stream().filter(str -> str.equals(value)).count());
            match.add(Integer.valueOf(value1));
        }
        return match;
    }

    @Test

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> arrReturn = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            arrReturn.add(a.get(i));
        }
        return arrReturn;


    }


    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> rowResults = new ArrayList<>();
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int i1 = 0;
                if (i + 2 < size && j + 2 < size) {
                    i1 = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                            + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                }
                else
                    break;
                rowResults.add(i1);
            }
        }
        Optional<Integer> max = rowResults.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());
        return max.get();
    }

    @Test
    public void testCase3() {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(-9, -9, -9, 1, 1, 1),
                Arrays.asList(0, -9, 0, 4, 3, 2), Arrays.asList(-9, -9, -9, 1, 2, 3),
                Arrays.asList(0, 0, 8, 6, 6, 0), Arrays.asList(0, 0, 0, -2, 0, 0), Arrays.asList(0, 0, 1, 2, 4, 0));
        hourglassSum(list);
    }

    @Test
    public void testCase2() {
        List<Integer> list = Arrays.asList(1, 5, 3, 6, 9);
        System.out.println(reverseArray(list));
    }

    @Test
    public void testCase() {
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");
        List<Integer> integers = ArrayBased.matchingStrings(strings, queries);
        System.out.println(integers);
    }


}