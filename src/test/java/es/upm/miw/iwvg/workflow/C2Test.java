package es.upm.miw.iwvg.workflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C2Test {

    @Test
    void testM1() {
        assertEquals("C2::m1", new C2().m1());
    }

 }
