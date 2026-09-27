package org.example;

import static org.junit.jupiter.api.Assertions.*;

class utilitiesTest {
    int variable;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        variable = 1;
    }

    @org.junit.jupiter.api.Test
    void testable() {
        assertEquals(1, utilities.testable());
    }
}