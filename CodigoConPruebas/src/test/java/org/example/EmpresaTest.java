package org.example;

import java.security.spec.ECPoint;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @org.junit.jupiter.api.Test
    void calcularSueldoTotalConIncramento1() {
        Empresa empresa = new Empresa();
        Empleado empleado = new Empleado("1111111a",12,1000);
        empresa.addEmoleado(empleado);
        empresa.calcularSueldoTotalConIncramento(3);
    }
    @org.junit.jupiter.api.Test
    void calcularSueldoTotalConIncramento2() {
        Empresa empresa = new Empresa();
        Empleado empleado = new Empleado("1111111a",70,1000);
        empresa.addEmoleado(empleado);
        empresa.calcularSueldoTotalConIncramento(3);
    }
    @org.junit.jupiter.api.Test
    void calcularSueldoTotalConIncramento3() {
        Empresa empresa = new Empresa();
        Empleado empleado = new Empleado("1111111a",40,6000);
        empresa.addEmoleado(empleado);
        empresa.calcularSueldoTotalConIncramento(3);
    }
}