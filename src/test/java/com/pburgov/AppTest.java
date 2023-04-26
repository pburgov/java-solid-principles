package com.pburgov;


import com.pburgov.liskov.Duck;
import com.pburgov.liskov.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AppTest {
    @Test
    void duck_can_fly_so_respects_the_liskov_principle() {

        Duck duck = new Duck();
        duck.fly();

        assertDoesNotThrow(() -> duck.fly());
    }

    @Test
    void penguin_cannot_fly_so_breaks_the_liskov_principle() {

        Penguin penguin = new Penguin();

        assertThrows(UnsupportedOperationException.class, penguin::fly);

    }
}
