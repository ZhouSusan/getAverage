package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {

    List<Integer> testCaseOne = Arrays.asList(0, 1);
    List<Integer> testCaseTwo = Arrays.asList(100, 10);
    List<Integer> testCaseThree = Arrays.asList(30, -30, 30);
    List <Integer> testCaseFour = Arrays.asList(-4);

    @Test
    void getAverage(){
        assertAll( () -> assertEquals(0.5, Average.getAverage(testCaseOne)),
                () -> assertEquals(55, Average.getAverage(testCaseTwo)),
                () -> assertEquals(10, Average.getAverage(testCaseThree)),
                () -> assertEquals(-4, Average.getAverage(testCaseFour)),
                () -> assertEquals(0.5, Average.getAvgUsingStreams(testCaseOne)),
                () -> assertEquals(55, Average.getAvgUsingStreams(testCaseTwo)),
                () -> assertEquals(10, Average.getAvgUsingStreams(testCaseThree)),
                () -> assertEquals(-4, Average.getAvgUsingStreams(testCaseFour)));
    }
}