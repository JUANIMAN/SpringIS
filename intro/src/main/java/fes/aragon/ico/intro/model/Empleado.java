package fes.aragon.ico.intro.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Empleado {
    private String nombre;
    private int idEmpleado;
    private double salario;
    private String puesto;
    private String departamento;
    private String fechaNacimiento;
}
