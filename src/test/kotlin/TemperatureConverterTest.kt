import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TemperatureConverterTest {
    private val temperatureConverter = TemperatureConverter()

    @Test
    fun celsiusToFahrenheit() {
        val celsius = 25.0
        val expectedFahrenheit = 77.0
        val result = temperatureConverter.celsiusToFahrenheit(celsius)
        assertEquals(expectedFahrenheit,result,0.01)
    }

    @Test
    fun fahrenheitToCelsius() {
        val fahrenheit = 68.0
        val expectedCelsius = 20.0
        val result = temperatureConverter.fahrenheitToCelsius(fahrenheit)
        assertEquals(expectedCelsius,result,0.01)
    }
}