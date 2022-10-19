package dynamic.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Triangle {

    public Integer [] [] memo;

    public static void main(String[] args) {
        List<List<Integer>> input = Arrays.asList(new ArrayList<>() {{add(2);}}, new ArrayList<>() {{add(3); add(4);}}, new ArrayList<>() {{add(6);add(5);add(7);}}, new ArrayList<>() {{add(4);add(1);add(8);add(3);}});
        Triangle triangle = new Triangle();
        triangle.minimumTotal(input);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
   //     bottom_up(triangle.size()-2, 0, triangle);
   //     int bottomUpResult = triangle.get(0).get(0);

        memo = new Integer[triangle.size()][triangle.size()];
        top_down(0, 0, triangle);
        return memo[0][0];
    }

    public void bottom_up(int i, int j, List<List<Integer>> triangle) {

        if(i < 0) {
            return;
        }

        int anElement = triangle.get(i).get(j);

        int case1 = triangle.get(i+1).get(j);
        int case2 = triangle.get(i+1).get(j+1);

        int newMin = Integer.min(anElement + case1, anElement + case2);
        triangle.get(i).set(j, newMin);
        if(j + 1 < triangle.get(i).size()) {
            bottom_up(i, j + 1, triangle);
        } else {
            bottom_up(i-1, 0, triangle);
        }
    }

    public int top_down(int i, int j, List<List<Integer>> triangle) {
        if (i == triangle.size()) {
            return 0;
        }

        if(memo[i][j] != null) return memo[i][j];

        var anElement = triangle.get(i).get(j);

        //case1
        int c1 = anElement + top_down(i + 1, j, triangle);
        //case2
        int c2 = anElement + top_down(i + 1, j + 1, triangle);
        var min = Integer.min(c1, c2);

        memo[i][j] = min;
        return min;
    }

}