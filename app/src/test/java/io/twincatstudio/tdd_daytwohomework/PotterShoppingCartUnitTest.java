package io.twincatstudio.tdd_daytwohomework;

import org.junit.Test;

import static org.junit.Assert.*;

public class PotterShoppingCartUnitTest {

    @Test
    public void getTotalPrice_book1_1_should_return_100() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        int expected = 100;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalPrice_book1_1_book2_1_should_return_190() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        target.addBooks(2, 1);
        int expected = 190;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalPrice_book1_1_book2_1_book3_1_should_return_270() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        target.addBooks(2, 1);
        target.addBooks(3, 1);
        int expected = 270;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalPrice_book1_1_book2_1_book3_1_book4_1_should_return_320() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        target.addBooks(2, 1);
        target.addBooks(3, 1);
        target.addBooks(4, 1);
        int expected = 320;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }
}