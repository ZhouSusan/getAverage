package org.example;
import java.util.List;

public class Average {
    public Double getAverage(List<Integer> list) {
        double tot = 0;
        if (!list.isEmpty()) {
            for (int num : list) {
                tot += num;
            }
            return tot/ list.size();
        }
        return tot;
    }
}