package ru.geekbrains.java.HomeWork.java_three.hw_6.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.java.HomeWork.java_three.hw_6.ArrayCheck;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayCheckTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, new int[]{2,1,4,4,1,1}},
                {true, new int[]{4,4,4,4,4}},
                {true, new int[]{1,1}},
                {true, new int[]{1,1,4,4,4,4,1,1}},
        });
    }

    private ArrayCheck arrCh;
    private boolean a;
    private int[] b;

    public ArrayCheckTest(boolean a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        arrCh = new ArrayCheck();
    }

    @Test
    public void testTask2() {
        Assert.assertEquals(a, arrCh.ArrayCheck4And1(b));
    }
}

