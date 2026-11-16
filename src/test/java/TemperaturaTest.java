import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureTest {
    private static final double DELTA = 0.001;

    @Test
    void fahrenheitParaCelsius_pontoDeCongelamento() {
        assertEquals(0.0, Temperatura.fahrenheitToCelsius(32), DELTA);
    }

    @Test
    void fahrenheitToCelsius_pontoDeEbulicao() {
        assertEquals(100.0, Temperatura.fahrenheitToCelsius(212), DELTA);
    }

    @Test
    void celsiusToFahrenheit_pontoDeCongelamento() {
        assertEquals(32.0, Temperatura.celsiusToFahrenheit(0), DELTA);
    }

    @Test
    void celsiusToFahrenheit_pontoDeEbulicao() {
        assertEquals(212.0, Temperatura.celsiusToFahrenheit(100), DELTA);
    }
}