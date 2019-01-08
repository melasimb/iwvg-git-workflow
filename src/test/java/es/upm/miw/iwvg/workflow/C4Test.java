package es.upm.miw.iwvg.workflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C4Test {

    @Test
    void testM1() {
        assertEquals("C4::m1", new C4().m1());
    }

}
