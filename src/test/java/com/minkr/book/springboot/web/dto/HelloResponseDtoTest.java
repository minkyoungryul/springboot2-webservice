package com.minkr.book.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombokFunctionTest(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        //then
        Assertions.assertThat(helloResponseDto.getName()).isEqualTo(name);
        Assertions.assertThat(helloResponseDto.getAmount()).isEqualTo(amount);

    }


}
