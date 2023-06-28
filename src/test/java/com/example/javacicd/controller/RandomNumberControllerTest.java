package com.example.javacicd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class RandomNumberControllerTest {
    @Autowired
    RandomNumberController numberController;

    @Test
    void randomNumberInBoundsTest() {
        assertThat(101).isGreaterThan(numberController.getRandomNumber());
    }

}
