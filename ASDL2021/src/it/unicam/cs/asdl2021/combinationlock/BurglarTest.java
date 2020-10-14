package it.unicam.cs.asdl2021.combinationlock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurglarTest {

    @Test
    final void testBurglar() {
        assertThrows(NullPointerException.class,
                () -> new Burglar(null));
        new Burglar(new CombinationLock("AAA"));
    }

    @Test
    final void testFindCombination() {
        Burglar b = new Burglar(new CombinationLock("XHS"));
        String comb = b.findCombination();
        System.out.println(comb);
        assertTrue(b.findCombination().equals("XHS"));
        assertTrue(b.getAttempts()>0);
    }

}
