/*
Author: Erik Abramczyk
Date: Feb 21, 2019
Purpose: Testing the telephone isFormatted method
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTelephone {
    @Test
    public void testFormatted() {
        assertTrue(!Telephone.isFormatted("111-111-1111"));
        assertTrue(!Telephone.isFormatted("(111 1111111"));
        assertTrue(Telephone.isFormatted("(111)111-1111"));
        assertTrue(!Telephone.isFormatted("abcabcabcdef"));
    }
}
