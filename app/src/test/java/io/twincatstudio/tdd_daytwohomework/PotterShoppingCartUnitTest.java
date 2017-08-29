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

    @Test
    public void getTotalPrice_book1_1_book2_1_book3_1_book4_1_book5_1_should_return_375() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        target.addBooks(2, 1);
        target.addBooks(3, 1);
        target.addBooks(4, 1);
        target.addBooks(5, 1);
        int expected = 375;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalPrice_book1_1_book2_1_book3_2_should_return_370() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        target.addBooks(2, 1);
        target.addBooks(3, 2);
        int expected = 370;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalPrice_book1_1_book2_2_book3_2_should_return_460() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 1);
        target.addBooks(2, 2);
        target.addBooks(3, 2);
        int expected = 460;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalPrice_book1_2_book2_2_book3_2_book4_1_book5_1_should_return_640() throws Exception {
        // Arrange
        PotterShoppingCart target = new PotterShoppingCart();
        target.addBooks(1, 2);
        target.addBooks(2, 2);
        target.addBooks(3, 2);
        target.addBooks(4, 1);
        target.addBooks(5, 1);
        int expected = 640;

        // Act
        int actual = target.getTotalPrice();

        // Assert
        assertEquals(expected, actual);
    }
}