package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {

    StringDuplicator mSUT;

    @Before
    public void setUp() throws Exception {
        mSUT = new StringDuplicator();
    }

    @Test
    public void SHOULD_returnEmpty_WHEN_StringIsEmpty() {
        String result = mSUT.duplicate("");
        assertThat(result, is(""));
    }

    @Test
    public void SHOULD_returnDoubleCharacter_WHEN_StringIsSingleCharacter() {
        String result = mSUT.duplicate("a");
        assertThat(result, is("aa"));
    }

    @Test
    public void SHOULD_returnDuplicatedLongString_WHEN_StringIsLong() {
        String result = mSUT.duplicate("Yuri Furusho");
        assertThat(result, is("Yuri FurushoYuri Furusho"));
    }

}