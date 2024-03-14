public class EmpleadoTemporal extends Empleado {
    private String temporal;

    public EmpleadoTemporal(String name, int age, int idEmpleado, int salario, String temporal) {
        super(name, age, idEmpleado, salario);
        this.temporal = temporal;
    }

    public String getTemporal() {
        return temporal;
    }

    public void setTemporal(String temporal) {
        this.temporal = temporal;
    }


    @Override
    public String toString() {
        return "Empleados de tipo Temporal.\n" +
                "ID del empleado: " + getIdEmpleado() +
                "\nNombre del empleado: " + getName() +
                "\nEdad del empleado: " + getAge() +
                "\nSalario del empleado: " + getSalario() +
                "\ntipo: " + temporal +"\n";
    }
}
