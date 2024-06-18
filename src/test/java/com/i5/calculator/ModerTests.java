package com.i5.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModerTests {
    @Test
    @DisplayName("2를 2으로 나눈 나머지를 계산. 0이 나온다.")
    public void testMod() {
        // given
        int first = 2;
        int second = 0;

        // when
        int result = new Moder().mod(first, second);

        // then
        Assertions.assertEquals(-1, result);
    }
}