package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector mSUT;

    @Before
    public void setUp() throws Exception {
        mSUT = new IntervalsAdjacencyDetector();
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1LeftAndNotToAdjacentInterval2() {
        Interval interval1 = new Interval(-8, -4);
        Interval interval2 = new Interval(4, 8);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1LeftAndOneNumberGapOfInterval2() {
        Interval interval1 = new Interval(-8, -4);
        Interval interval2 = new Interval(-3, 8);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnTrue_WHEN_Interval1LeftAndAdjacentToInterval2() {
        Interval interval1 = new Interval(-8, -4);
        Interval interval2 = new Interval(-4, 8);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1LeftAndOverlapingWithInterval2() {
        Interval interval1 = new Interval(-8, 2);
        Interval interval2 = new Interval(-2, 8);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1IsContainedByInterval2() {
        Interval interval1 = new Interval(-8, -4);
        Interval interval2 = new Interval(-15, 8);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1ContainsInterval2() {
        Interval interval1 = new Interval(-16, 16);
        Interval interval2 = new Interval(-3, 8);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1RightAndOverlapingInterval2() {
        Interval interval1 = new Interval(0, 12);
        Interval interval2 = new Interval(-3, 8);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnTrue_WHEN_Interval1RightAndAdjacentToInterval2() {
        Interval interval1 = new Interval(23, 35);
        Interval interval2 = new Interval(12, 23);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1RightAndOneNumberGapWithInterval2() {
        Interval interval1 = new Interval(24, 32);
        Interval interval2 = new Interval(13, 23);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1RightAndANotdjacentWithInterval2() {
        Interval interval1 = new Interval(31, 45);
        Interval interval2 = new Interval(13, 23);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void SHOULD_returnFalse_WHEN_Interval1IsTheSameAsInterval2() {
        Interval interval1 = new Interval(31, 45);
        Interval interval2 = new Interval(31, 45);
        boolean result = mSUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

}