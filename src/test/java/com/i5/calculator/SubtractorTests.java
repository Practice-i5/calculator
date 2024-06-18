package com.i5.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SubtractorTests {

    @Test
    @DisplayName("1과 2를 뺀 결과가 -1인이 확인")
    public void testSubtract() {

        //given
        int first = 1;
        int second = 2;

        //when
        int result = new Subtractor().subtract(first, second);

        //then(verify)

        Assertions.assertEquals(-1, result);
    }

    @Test
    @DisplayName("2과 2를 뺀 결과가 -1인이 확인")
    public void testSubtract2() {

        //given
        int first = 2;
        int second = 2;

        //when
        int result = new Subtractor().subtract(first, second);

        //then(verify)

        Assertions.assertEquals(-1, result);
    }
}
