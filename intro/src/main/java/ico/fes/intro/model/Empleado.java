package ico.fes.intro.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {
    private int Id;
    private String Nombre;
    private double Sueldo;
    private String Departamento;
    private String fechaNacimiento;


}
