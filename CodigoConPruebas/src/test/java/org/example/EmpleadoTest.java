package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void comprobarDNI1() throws Exception {
        Empleado empleado = new Empleado("111111a",30,5000);
        empleado.comprobarDNI();
    }
    @Test
    void comprobarDNI2() throws Exception {
        Empleado empleado = new Empleado("111111111",30,5000);
        empleado.comprobarDNI();
    }
    @Test
    void comprobarDNI3() throws Exception {
        Empleado empleado = new Empleado("11111111A",30,5000);
        empleado.comprobarDNI();
    }
}