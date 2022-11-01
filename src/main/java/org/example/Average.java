package org.example;
import java.util.List;

public class Average {
    public static Double getAverage(List<Integer> list) {
        double tot = 0;
        if (!list.isEmpty()) {
            for (int num : list) {
                tot += num;
            }
            return tot/ list.size();
        }
        return tot;
    }

    public static Double getAvgUsingStreams(List<Integer> list) {
        return list.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}