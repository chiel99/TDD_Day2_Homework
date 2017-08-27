package io.twincatstudio.tdd_daytwohomework;

import org.junit.Test;

import static org.junit.Assert.*;

public class PotterShoppingCartUnitTest {

    @Test
    public void getTotalPrice_chapter1_1_should_return_100() {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        int expected = 100;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }
}