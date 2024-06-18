package com.i5.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplierTests {

    @Test
    @DisplayName("2와 4를 곱한 결과가 8인지 확인")
    public void testMultiply(){
        //given
        int first=2;
        int second=4;

        //when
        int result= new Multiplier().multiply(first,second);

        //then
        Assertions.assertEquals(8,result);
    }

    @Test
    @DisplayName("3과 7을 곱한 결과가 21인지 확인")
    public void testMultiply2(){

        //given
        int first=3;
        int second=17;

        //when
        int result = new Multiplier().multiply(first,second);

        //then
        Assertions.assertEquals(21,result);

    }
}
