package org.tiana.mathutil.core.test;

import org.junit.jupiter.api.Test;
import org.tiana.mathutil.core.MathUtility;

import static org.junit.jupiter.api.Assertions.*;
import static org.tiana.mathutil.core.MathUtility.getFactorial;
//import static chỉ dành cho những hàm static, để giúp ta làm biếng gõ tên class chấm. Lẽ ra phải gõ MathUtility.getFactorial(2); thì này chỉ cần gõ getFactorial(2) là đủ
//giả sử class có nhiều hàm static thì ta đổi qua dấu *;

class MathUtilityTest {

    @Test//@Test là ghi chú, đánh dấu, kí hiệu - annotation báo hiệu rằng hàm này là hàm main() có thể run
    //1 class test có thể có nhiều @Test, vậy 1 class Test có thể có nhiều hàm main() - ể ứng với nhiều kịch bản test, nhiều test case
    //TEST CASE #1l: Check getFactorial() method with valid parameter e.g. n=0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n=0
    //2. Call getFactorial(n=0)
    //3. Execute
    // EXPECTED RESULT:
    // The method returns 1 as the result of 0!
    public void testFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expectedValue = 1;//hope to see 0! = 1, kì vong thoy
        //gọi hàm để xem actual
        long actualValue = getFactorial(n);
        assertEquals(expectedValue, actualValue);
        //vietsub: so sánh xem 0! có trả về con số 1 hay ko
        //                           actual       expected
        assertEquals(1, getFactorial(0));
        //MÀU XANH PASSED NẾU 2 ĐỨA BẰNG NHAU
        //MÀU ĐỎ FAILED NẾU 2 ĐỨA KHÔNG BẰNG NHAU
        //MẮT
    }
    @Test
    public void testFactorialGivenRightArg3RunsWell() {
        assertEquals(120, getFactorial(5));
    }
    @Test
    public void testFactorialGivenRightArg5RunsWell() {
         assertEquals(120, getFactorial(5));
    }
}