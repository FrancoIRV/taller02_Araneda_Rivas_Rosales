import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void opcionesMenu() {
        System.out.println("Opciones:");
        System.out.println("1. Ocupar habitación");
        System.out.println("2. Reiniciar hotel");
        System.out.println("");
    }

    public static void ejecutarMenu(String[] habitaciones) {
        opcionesMenu();
        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                ocuparHabitacion(habitaciones);
                break;
            case 2:
                reiniciarHotel(habitaciones);
                break;
            default:
                System.out.println("Selección inválida.");
                break;
        }


    }

    public static void run() {
        String[] listaHabitaciones = {"S", "S", "S", "D", "D", "D", "D", "D", "D", "D"};
        ejecutarMenu(listaHabitaciones);
    }

    public static void ocuparHabitacion(String[] habitaciones) {

    }

    public static void reiniciarHotel(String[] habitaciones) {
        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = (i < 3) ? "S" : "D";
        }
        System.out.println("Hotel reiniciado.");
    }

    public static void mostrarHabitaciones(String[] habitaciones) {
        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println("Habitación " + i + ": " + habitaciones[i]);
        }
    }
}
