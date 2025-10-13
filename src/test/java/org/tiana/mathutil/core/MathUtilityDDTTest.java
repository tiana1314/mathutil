package org.tiana.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // chuẩn bị bộ data để riêng, sau đó fill vào lệnh test
    //mảng 2 chiều, gồm giá trị kì vọng con n!
    public static Object[][] initTestData() {
        //Object dataset={,,,}; //={các phần tử của mảng cách nhau dấu ,}
                                //{5,10,15,20}
        Object[][] dataset =  {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
        return dataset;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected) {
        assertEquals(expected,MathUtility.getFactorial(n));
    }

}