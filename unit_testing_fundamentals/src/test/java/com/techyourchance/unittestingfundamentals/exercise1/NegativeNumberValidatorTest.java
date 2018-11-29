package com.techyourchance.unittestingfundamentals.exercise1;

import com.techyourchance.unittestingfundamentals.example1.PositiveNumberValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class NegativeNumberValidatorTest {

    public NegativeNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new NegativeNumberValidator();
    }

    @Test
    public void SHOULD_ReturnTrue_WHEN_NumberIsNegative() {
        boolean result = SUT.isNegative(-1);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void SHOULD_ReturnFalse_WHEN_NumberIsPositive() {
        boolean result = SUT.isNegative(1);
        Assert.assertThat(result, is(false));

    }

    @Test
    public void SHOULD_ReturnFalse_WHEN_NumberIsZero() {
        boolean result = SUT.isNegative(0);
        Assert.assertThat(result, is(false));

    }
}