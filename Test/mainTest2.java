import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HotelTest {

    private String[] habitaciones;
    private int[] diasReservados;

    @BeforeEach
    void setUp() {
        habitaciones = new String[]{"O", "O", "D", "O", "D", "O", "D", "O", "D", "O"};
        diasReservados = new int[]{2, 3, 0, 4, 0, 1, 0, 3, 0, 2};  // O -> Ocupada, D -> Disponible
    }

    @Test
    void testVaciarHabitacion() {
        Main.vaciarHabitacion(habitaciones, diasReservados, 2);

        assertEquals("D", habitaciones[1], "La habitación 2 debe estar vacía (D).");
        assertEquals(0, diasReservados[1], "Los días reservados para la habitación 2 deben ser 0.");
    }

    @Test
    void testVaciarHabitacionFueraDeRango() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Main.vaciarHabitacion(habitaciones, diasReservados, 11);
        });
        assertEquals("Index 11 out of bounds for length 10", exception.getMessage());
    }

    @Test
    void testReiniciarHotel() {
        Main.reiniciarHotel(habitaciones);

        for (String habitacion : habitaciones) {
            assertEquals("D", habitacion, "Cada habitación debe estar en estado disponible (D).");
        }
    }

    @Test
    void testReiniciarHotelConAlgunasOcupadas() {
        // Cambiamos algunas habitaciones a estado "O" (ocupada)
        habitaciones[0] = "O";
        habitaciones[4] = "O";

        Main.reiniciarHotel(habitaciones);

        for (String habitacion : habitaciones) {
            assertEquals("D", habitacion, "Cada habitación debe estar en estado disponible (D).");
        }
    }
}
