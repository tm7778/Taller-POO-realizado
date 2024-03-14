public class EmpleadoEspecifico extends Empleado {
    private String specific;

    public EmpleadoEspecifico(String name, int age, int idEmpleado, int salario, String specific) {
        super(name, age, idEmpleado, salario);
        this.specific = specific;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    @Override
    public String toString() {
        return "Empleados de tipo Permanente.\n" +
                "ID del empleado: " + getIdEmpleado() +
                "\nNombre del empleado: " + getName() +
                "\nEdad del empleado: " + getAge() +
                "\nSalario del empleado: " + getSalario() +
                "\ntipo: " + specific;
    }
}
