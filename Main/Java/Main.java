import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    }

    String[] listaHabitaciones = {"D", "D", "D", "D", "D", "D", "D", "D", "D", "D"};
    Scanner scanner = new scanner(System.in);

    /* obtenemos los datos de la reserva */
    public static String confirmarServicio(Scanner scanner) {
        try {
            System.out.println("1. desea servicio con comida, cuesta 45000$ por noche");
            System.out.println("2. desea servicio sin comida, cuesta 30000$ por noche");
            String servicio = scanner.nextLine();
            return servicio;
        } catch (Exception e) {
            System.out.println("Ingrese datos validos");
        }
    }

    public static int pedirDias(Scanner) {
        try {
            System.out.println("¿Cuantos dias quiere hospedar?");
            int diasOcupados = scanner.nextint();
            return diasOcupados;
        } catch (Exception e) {
            System.out.println("Ingrese datos validos");
        }
    }
    public static boolean validarDias(int diasOcupados){
        boolean estado = false;
        if diasOcupados >= 0 {
            estado = true;
        }
        return estado;
    }
    public static validarServicio(String servicio){
        boolean estado = false
        switch{
            case 1:
                if servicio == "1"{
                    estado = true;
                    break;
            }
            case 2:
                if servicio == "2" {
                estado = true;
                break;
            }
        }
        return estado;
    }
    /* cambia el estado de la lista de disponible a reservado */
    public static void realizarReserva(String[] listaHabitaciones, int[] listaDias, int diasOcupados){
        for(int i = 0; i <= listaHabitaciones.length; i++){
            if listaHabitaciones[i].equals("D"){
                listaHabitaciones[i] = "R";
                listaDias[i] = diasOcupados
                break;
            }
            else{
                System.out.println("No hay habitaciones disponibles");
            }
        }
    }
    public static void ocuparHabitacion(String tipoServicio, int diasOcupados, String[] listaHabitaciones, int[] listaDias){
        for int i = 0; i<= listaHabitaciones.length; i++){
            if listaHabitaciones[i].equals("D"){
                listaHabitaciones[i] = tipoServicio;
                listaDias[i] = diasOcupados;
                break;
            }
            else{
                System.out.println(" no hay habitaciones disponibles");
            }
        }


    }
}

