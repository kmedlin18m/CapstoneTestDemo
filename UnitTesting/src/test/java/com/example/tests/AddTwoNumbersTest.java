package com.example.tests;

import com.example.main.AddTwoNumbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {

    @Test
    public void testAdd() {
        // Test the add method directly
        assertEquals(3, AddTwoNumbers.add(1, 2), "1 + 2 should equal 3");
    }
}
