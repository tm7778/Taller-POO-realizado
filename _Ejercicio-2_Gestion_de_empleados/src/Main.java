import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objScan = new Scanner(System.in);
        GestionEmpleado gestorEmpleado = new GestionEmpleado();
        int option = 0;
        do {
            System.out.println("""
                    Menú de gestión de empleados
                    1. Añadir empleados.
                    2. Eliminar Empleados.
                    3. Mostrar empleados.
                    4. Salir.
                    """);
            option = objScan.nextInt();
            switch (option) {
                case 1:
                    gestorEmpleado.addEmpleados(objScan);
                    break;
                case 2:
                    gestorEmpleado.deleteEmpleados(objScan);
                    break;

                case 3:
                    int option2 = 0;
                    do {
                        System.out.println("""
                    Mostrar Empleados
                    1. Mostrar todos los Empleados.
                    2. Mostrar los Empleados tipo Permanente.
                    3. Mostrar los Empleados tipo Temporal.
                    4. Salir.
                    """);
                        option2 = objScan.nextInt();
                        switch (option2){
                            case 1:
                                gestorEmpleado.mostrarEmpleados();
                                break;
                            case 2:
                                gestorEmpleado.mostrarEmpleadosPerm();
                                break;
                            case 3:
                                gestorEmpleado.mostrarEmpleadosTemp();
                                break;
                        }
                    } while (option2 != 4);
                    break;
            }
        } while (option != 4);
    }
}