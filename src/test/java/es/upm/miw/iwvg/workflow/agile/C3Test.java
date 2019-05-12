package es.upm.miw.iwvg.workflow.agile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C3Test {

    @Test
    void testM1() {
        assertEquals("C3::m1", new C3().m1());
    }

}
