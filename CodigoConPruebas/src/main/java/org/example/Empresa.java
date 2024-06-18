package org.example;

import java.util.ArrayList;
import java.util.List;
public class Empresa {
    List<Empleado> empleados;
    Empresa(){
        empleados = new ArrayList<>();
    }
    void addEmoleado(Empleado e){
        this.empleados.add(e);
    }
    double calcularSueldoTotalConIncramento(double incremento){
        double suma = 0;
        for (Empleado e:empleados)
            if (e.getEdad() < 18 || e.getEdad() > 65)
                return -1;
            else
            if (e.getSueldo() <5000)
                suma += e.getSueldo() * (1+incremento);
        return suma;
    }
}