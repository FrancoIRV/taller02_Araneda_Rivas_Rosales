import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainTest {

    @Test
    void testConfirmarServicioConComida() {
        String input = "1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        String servicio = Main.confirmarServicio(scanner);
        assertEquals("1", servicio, "El servicio debería ser '1' para servicio con comida.");
    }

    @Test
    void testConfirmarServicioSinComida() {
        String input = "2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        String servicio = Main.confirmarServicio(scanner);
        assertEquals("2", servicio, "El servicio debería ser '2' para servicio sin comida.");
    }

    @Test
    void testPedirDias() {
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        int dias = Main.pedirDias(scanner);
        assertEquals(3, dias, "El número de días debería ser 3.");
    }

    @Test
    void testPedirDiasConInputInvalido() {
        String input = "abc\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        int dias = Main.pedirDias(scanner);
        assertEquals(-1, dias, "Debería retornar -1 en caso de un input no válido.");
    }
}




