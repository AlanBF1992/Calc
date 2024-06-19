import org.junit.Test;
import praxis.Calculadora;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    private static Logger logger = Logger.getLogger("praxis.Calculadora");

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void TestSumar(){
        logger.info("Test Sumar");
        int resultado = calculadora.sumar(3,5);
        assertEquals(8,resultado);
    }

    @Test
    public void TestRestar(){
        logger.info("Test Restar");
        int resultado = calculadora.restar(3,5);
        assertEquals(-2,resultado);
    }
    @Test
    public void TestMultiplicar(){
        logger.info("Test Multiplicar");
        int resultado = calculadora.multiplicar(3,5);
        assertEquals(15,resultado);
    }
    @Test
    public void TestDividir(){
        logger.info("Test Dividir");
        double resultado = calculadora.dividir(3,5);
        assertEquals(0.6,resultado, 1e-15);
    }
}
