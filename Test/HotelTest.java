package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HotelTest {

    private Hotel hotel;

    @BeforeEach
    void setUp() {
        hotel = new Hotel(10);
    }

    @Test
    void testCantidadDeHabitaciones() {
        assertEquals(10, hotel.getCantidadDeHabitaciones(), "El hotel debe tener 10 habitaciones.");
    }

    @Test
    void testHabitacionFueraDeRango() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            hotel.getHabitacion(14);
        });
        assertEquals("Número de habitación fuera de rango.", exception.getMessage());
    }
}
