import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleado {
    private ArrayList<Empleado> listEmpleados;
    private ArrayList<EmpleadoTemporal> listEmpleadoTemporal;
    private ArrayList<EmpleadoEspecifico> listEmpleadoEspecifico;

    public static int idEmpleado = 1;

    public GestionEmpleado() {
        this.listEmpleados = new ArrayList<>();
        this.listEmpleadoEspecifico = new ArrayList<>();
        this.listEmpleadoTemporal = new ArrayList<>();
    }

    public void addEmpleados(Scanner objScan) {
        objScan.nextLine();
        System.out.println("Agregue el nombre del empleado.");
        String name = objScan.nextLine();
        System.out.println("Agregue la edad del empleado.");
        int age = objScan.nextInt();
        System.out.println("Agregue el salario del empleado.");
        int salario = objScan.nextInt();
        objScan.nextLine();
        System.out.println("Agregue le tipo de empleado. (Escriba Temporal o Permanente según el tipo.)");
        String tipo = objScan.nextLine().toLowerCase();
        Empleado objEmpleado = new Empleado(name, age, idEmpleado, salario);
        this.listEmpleados.add(objEmpleado);
        idEmpleado++;
        if (tipo.equals("permanente")) {
            EmpleadoEspecifico objEmpleadoEspecifico = new EmpleadoEspecifico(name, age, idEmpleado, salario, tipo);
            this.listEmpleadoEspecifico.add(objEmpleadoEspecifico);
            this.listEmpleados.add(objEmpleadoEspecifico);
            System.out.println("El empleado de tipo permanente fue agregado correctamente.\n");
        } else {
            EmpleadoTemporal objEmpleadoTemp = new EmpleadoTemporal(name, age, idEmpleado, salario, tipo);
            this.listEmpleadoTemporal.add(objEmpleadoTemp);
            this.listEmpleados.add(objEmpleadoTemp);

            System.out.println("El empleado de tipo temporal fue agregado correctamente.\n");
        }
    }

    public void deleteEmpleados(Scanner objScan) {
        objScan.nextLine();
        System.out.println("Ingrese el tipo de empleado que quiere eliminar (Temporal o Permanente)");
        String tipoAEliminar = objScan.nextLine().toLowerCase();
        if (tipoAEliminar.equals("temporal")) {
            this.mostrarEmpleadosTemp();
            System.out.println("Agregue el Id del empleado que quiera eliminar.\n");
            int idDelete = objScan.nextInt();
            boolean idEmpleadoAeliminar = this.listEmpleadoTemporal.removeIf(
                    empleadoTemporal -> empleadoTemporal.getIdEmpleado() == idDelete
            );
            if (idEmpleadoAeliminar) {
                System.out.println("El empleado con contrato temporal ha sido eliminado correctamente.\n");
            } else {
                System.out.println("El id del empleado que intentas eliminar no es válido.\n");
            }
        } else if (tipoAEliminar.equals("permanente")) {
            this.mostrarEmpleadosPerm();
            System.out.println("Agregue el Id del empleado que quiera eliminar.\n");
            int idDelete = objScan.nextInt();
            boolean idEmpleadoAeliminar = this.listEmpleadoEspecifico.removeIf(
                    empleadoEspecifico -> empleadoEspecifico.getIdEmpleado() == idDelete
            );
            if (idEmpleadoAeliminar) {
                System.out.println("El empleado con contrato temporal ha sido eliminado correctamente.\n");
            } else {
                System.out.println("El id del empleado que intentas eliminar no es válido.");
            }
        } else {
            System.out.println("Ha ocurrido un error.");
        }

    }

    public void mostrarEmpleadosTemp() {
        if (this.listEmpleadoTemporal.isEmpty()) {
            System.out.println("No hay empleados en la sección de empleados temporales\n");
        } else {
            System.out.println("Estos son todos los empleados con contrato temporal que están disponibles.\n");
            for (EmpleadoTemporal temp : this.listEmpleadoTemporal) {
                System.out.println(temp.toString());
            }
        }
    }

    public void mostrarEmpleadosPerm() {
        if (this.listEmpleadoEspecifico.isEmpty()) {
            System.out.println("No hay empleados en la sección de empleados permanentes\n");
        } else {
            System.out.println("Estos son todos los empleados con contrato permanente que están disponibles.\n");
            for (EmpleadoEspecifico temp : this.listEmpleadoEspecifico) {
                System.out.println(temp.toString());
            }
        }
    }

    public void mostrarEmpleados() {
        if (this.listEmpleados.isEmpty()) {
            System.out.println("No hay empleados disponibles para listar.\n");
        } else {
            System.out.println("Estos son todos los empleados de nuestra empresa.\n");
            String obj = "";
            for (Empleado temp : this.listEmpleadoEspecifico) {
                if (temp != null) {
                obj += "Empleados.\n" +
                        "ID del empleado: " + temp.getIdEmpleado() +
                        "\nNombre del empleado: " + temp.getName() +
                        "\nEdad del empleado: " + temp.getAge() +
                        "\nSalario del empleado: " + temp.getSalario()+"\n";
                }
            }

            for (Empleado temp : this.listEmpleadoTemporal) {
                if (temp != null) {
                    obj += "Empleados.\n" +
                            "ID del empleado: " + temp.getIdEmpleado() +
                            "\nNombre del empleado: " + temp.getName() +
                            "\nEdad del empleado: " + temp.getAge() +
                            "\nSalario del empleado: " + temp.getSalario()+"\n";
                }
            }
            System.out.println(obj);
        }
    }
}

