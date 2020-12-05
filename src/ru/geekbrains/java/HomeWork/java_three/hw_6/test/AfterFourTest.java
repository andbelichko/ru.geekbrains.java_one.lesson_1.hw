package ru.geekbrains.java.HomeWork.java_three.hw_6.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.java.HomeWork.java_three.hw_6.AfterFour;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AfterFourTest {
    @Parameterized.Parameters
    public static Collection<Object[][]> data() {
        return Arrays.asList(new Object[][][] {
                {{4, 2, 5, 9, 11, 23, 12, 0, 34, 3, 6}, {2, 5, 9, 11, 23, 12, 0, 34, 3, 6}},
                {{1, 63, 5, 9, 25, 8, 12, 0, 6, 3, 4}, {}},
                {{7, 2, 5, 25, 6, 4, 12, 0, 34, 3, 6}, {12, 0, 34, 3, 6}}
        });
    }

    private int[] arrTest;
    private Integer[] arrExc;
    private AfterFour afterFour;
    public AfterFourTest(int[] arrTest, Integer[] arrExc) {
        this.arrTest = arrTest;
        this.arrExc = arrExc;
    }


    @Before
    public void init () {
        afterFour = new AfterFour();
    }

    @Test
    public void test1 () {
        Assert.assertArrayEquals(arrExc, afterFour.afterFour4(arrTest));
    }
}


