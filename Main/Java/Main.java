import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    }

    String[] listaHabitaciones = {"D", "D", "D", "D", "D", "D", "D", "D", "D", "D"};
    Scanner scanner = new scanner(System.in);


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
    public static void reiniciarHotel(String[] habitaciones) {

        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = "D";
        }
        System.out.println("Hotel reiniciado.");
    }
    static void vaciarHabitacion(String [] habitaciones,int [] diasReservados, int nro){
        habitaciones[nro-1] = "D";
        diasReservados[nro-1] = 0;
        System.out.println("Habitacion vaciada");
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
    public static void imprimirBoleta(String [] habitaciones, int [] diasReservados, int nro,double total ){
        System.out.println("la habitacion se uso:"+ diasReservados[nro-1] + "dias");
        System.out.println("el monto total es"+ calcularTotal(habitaciones,diasReservados,nro));
    }

    public static boolean conAlimentacion(String [] habitaciones,int nro){
        Boolean estado = false;
        if (habitaciones[nro-1].equals("OA")){
            estado = true;
        } else if (habitaciones[nro-1].equals("OS")) {
            estado = false;
        } return false;
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
}

