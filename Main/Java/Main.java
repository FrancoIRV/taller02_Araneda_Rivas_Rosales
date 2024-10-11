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
            System.out.println("Ingrese datos validos")
        }
    }

    public static int pedirDias(Scanner) {
        try {
            System.out.println("¿Cuantos dias quiere hospedar?");
            diasOcupados = scanner.nextint();
            return diasOcupados;
        } catch (Exception e) {
            System.out.println("Ingrese datos validos");
        }
    }
}

