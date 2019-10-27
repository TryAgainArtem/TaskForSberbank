package com.math;

import com.math.Logic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AriphTest {
    private static Logic logic;
    private static int x;

    @BeforeClass
    public static void createNewObj(){
        logic = new Logic();
    }
    @Test
    public void AriphTestShouldEqualsSetValue(){
        String resSum, resSub, resMult, resDiv;
        int x = 5;
        resSum = logic.Ariph(x,x,"+");
        resSub = logic.Ariph(x,x,"-");
        resMult = logic.Ariph(x,x,"*");
        resDiv = logic.Ariph(x,x,"/");
        Assert.assertEquals("10", resSum);
        Assert.assertEquals("0", resSub);
        Assert.assertEquals("25", resMult);
        Assert.assertEquals("1", resDiv);
    }
    @Test
    public void CheckShouldEqualsError(){
        String lag = "asd";
        String resStr = logic.check(lag);
        Assert.assertEquals("Error value", resStr);
    }

}
