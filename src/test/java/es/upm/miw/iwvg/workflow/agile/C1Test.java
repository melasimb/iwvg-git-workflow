package es.upm.miw.iwvg.workflow.agile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C1Test {

    @Test
    void testM1() {
        assertEquals("C1::m1", new C1().m1());
    }

    @Test
    void testM2() {
        assertEquals("C1::m2", new C1().m2());
    }

    @Test
    void testM3() {
        assertEquals("C1::m3", new C1().m3());
    }

    @Test
    void testM4() {
        assertEquals("C1::m4", new C1().m4());
    }
}
