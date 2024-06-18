package com.i5.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdderTests {
    @Test
    @DisplayName("2과 3를 더한 결과가 5인지 확인") // Displayname : Build에 원하는 이름으로 출력
    public void testAdd() {
        // given
        int first = 2;
        int second = 3;

        // when
        int result = new Adder().add(first, second);

        // then(verify)
        Assertions.assertEquals(3, result);
    }
}