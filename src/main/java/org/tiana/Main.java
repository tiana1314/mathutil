package org.tiana;

import org.tiana.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }
    //TEST CASE #1l: Check getFactorial() method with valid parameter e.g. n=0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n=0
    //2. Call getFactorial(n=0)
    //3. Execute
    // EXPECTED RESULT:
    // The method returns 1 as the result of 0!
    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expectedValue = 1;//hope to see 0! = 1, kì vong thoy
        //gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        //so sánh expected vs actual
        //dùng biến boolean hoặc in ra
        System.out.println("0!exepted: "+expectedValue);
        System.out.println("0!actual: "+actualValue);
    }
    //TEST CASE #2l: Check getFactorial() method with valid parameter e.g. n=0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n=5
    //2. Call getFactorial(n=5)
    //3. Execute
    // EXPECTED RESULT:
    // The method returns 120 as the result of 5!
    public static void testFactorialGivenRightArg5RunsWell() {
        int n = 5;
        long expectedValue = 120;//hope to see 5! = 120, kì vong thoy
        //gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        //so sánh expected vs actual
        //dùng biến boolean hoặc in ra
        System.out.println("5!exepted: "+expectedValue);
        System.out.println("5!actual: "+actualValue);
    }
    //TEST CASE #3l: Check getFactorial() method with valid parameter e.g. n=0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n=6
    //2. Call getFactorial(n=6)
    //3. Execute
    // EXPECTED RESULT:
    // The method returns 720 as the result of 6!
    public static void testFactorialGivenRightArg6RunsWell() {
        int n = 6;
        long expectedValue = 720;//hope to see 6! = 720, kì vong thoy
        //gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        //so sánh expected vs actual
        //dùng biến boolean hoặc in ra
        System.out.println("6!exepted: "+expectedValue);
        System.out.println("6!actual: "+actualValue);
    }
    //TEST CASE #4l: Check getFactorial() method with valid parameter e.g. n=0
    //STEPS/PROCEDURE:
    //1. Given an invalid n, e.g. n=-5
    //2. Call getFactorial(n=-5)
    //3. Execute
    // EXPECTED RESULT:
    // The method will throw an exception
    //STATUS:
    // PASSE HAY FAILED ĐOÁN XEM, CHẠY APP ĐÃ!!!
    public static void testFactorialGivenWrongArgMinus5ThrowsException() {
        // MathUtility.getFactorial(-5);//PASSED, VÌ K VỌNG NGOẠI LỆ XH, VÀ

    }
}