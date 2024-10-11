import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        run();
    }

    public static void opcionesMenu() {
        System.out.println("--------MENU--------");
        System.out.println("1. Realizar reserva");
        System.out.println("2. Ocupar habitacion ");
        System.out.println("3. Vaciar habitacion");
        System.out.println("4. Imprimir boleta");
        System.out.println("5. Reiniciar hotel");
        System.out.println("6. Mostrar habitaciones");
        System.out.println("7. Salir");


    }

    public static void run() {
        String[] listaHabitaciones = {"D", "D", "D", "D", "D", "D", "D", "D", "D", "D"};
        int [] diasReservados = {0,0,0,0,0,0,0,0,0,0};
        ejecutarMenu(listaHabitaciones,diasReservados);
    }

    public static void ejecutarMenu(String[] habitaciones, int [] diasReservados) {
        opcionesMenu();
        int opcion = pedirOpcionMenu();

        switch (opcion){
            case 1:
                //relizarreserva()
            case 2:
                //ocuparhabitacion
            case 3:
                vaciarHabitacion(habitaciones,diasReservados,2);
            case 4:

            case 5:
                reiniciarHotel(habitaciones);
            case 6:
                mostrarHabitaciones(habitaciones);
                break;
            case 7:
                break;
        }
    }
    public static void imprimirBoleta(String [] habitaciones, int [] diasReservados, int nro,double total){
        System.out.println("la habitacion se uso:"+ diasReservados[nro-1] + "dias");
        System.out.println("el monto total es"+ calcularTotal(habitaciones,diasReservados,nro));

    }

    public static double calcularTotal(String [] habitaciones, int [] diasReservados, int nro){
        double total = 0;
        if (habitaciones[nro-1].equals("OA")){
            total = 45.000* diasReservados[nro-1];
        } else if (habitaciones[nro-1].equals("OS")) {
            total = 30.000* diasReservados[nro-1];
        }
        return total;
    }

    public static int pedirOpcionMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una opcion");
        return sc.nextInt();
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