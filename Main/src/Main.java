import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void opcionesMenu() {
        System.out.println("--------MENU--------");
        System.out.println("1. Realizar reserva");
        System.out.println("2. Ocupar habitacion ");
        System.out.println("3. Vaciar habitacion");
        System.out.println("4. Imprimir boleta");
    }

    public static void run() {
        String[] listaHabitaciones = {"S", "S", "S", "D", "D", "D", "D", "D", "D", "D"};
        int [] diasReservados = {0,0,0,0,0,0,0,0,0,0};
        ejecutarMenu(listaHabitaciones,diasReservados);
    }

    public static void ejecutarMenu(String[] habitaciones, int [] diasReservados) {
        opcionesMenu();
        int valor = pedirOpcionMenu();

        switch (valor){
            case 1:
                //relizarreserva()
            case 2:
                //ocuparhabitacion
            case 3:
                vaciarHabitacion(habitaciones,diasReservados,2);
            case 4:
                //realizar reserva
        }
    }

    public static int pedirOpcionMenu(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese una opcion");
            return sc.nextInt();
        } catch (Exception e){
            System.out.println("Error");
        }
    }


    public static int getIndex(String[] habitaciones, String diasReservados) {

        int index = -1;
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i].equals(diasReservados)) {
                index = i;
                break;
            }
        }
        return index;
    }

    static void vaciarHabitacion(String [] habitaciones,int [] diasReservados, int nro){
        habitaciones[nro-1] = "D";
        diasReservados[nro-1] = 0;
        System.out.println("Habitacion vaciada");
    }

    public static void reiniciarHotel(String[] habitaciones) {

        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = "D";
        }
        System.out.println("Hotel reiniciado.");
    }

    public static void mostrarHabitaciones(String [] habitaciones){

        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println("habitaciones: "+ habitaciones[i]);
        }
    }
}