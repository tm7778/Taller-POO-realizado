public class Empleado extends Persona {
    private int idEmpleado;
    private double salario;
    private String tipo;

    public Empleado(String name, int age, int idEmpleado, int salario) {
        super(name, age);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleados.\n" +
                "ID del empleado: " + getIdEmpleado() +
                "\nNombre del empleado: " + getName() +
                "\nEdad del empleado: " + getAge() +
                "\nSalario del empleado: " + getSalario();
    }
}
