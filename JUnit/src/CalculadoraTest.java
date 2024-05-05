import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        //Creamos el objeto que vamos a usar
        Calculadora calculadora = new Calculadora();
        //Utilizamos un tipo de asserción para verificar que los resultados que obtenemos coincide con lo que esperamos.
        assertAll(
                () -> assertEquals(10,calculadora.sumar(5,5)),
                () -> assertEquals(3,calculadora.sumar(-2,5)),
                () -> assertEquals(1,calculadora.sumar(1,0)),
                () -> assertEquals(172,calculadora.sumar(70,102)),
                () -> assertEquals(0,calculadora.sumar(0,0))
        );

    }

    @org.junit.jupiter.api.Test
    void restar() {
        //Creamos el objeto que vamos a usar
        Calculadora calculadora = new Calculadora();
        //Utilizamos el método assertAll
        assertAll(
                () -> assertEquals(1,calculadora.restar(6,5)),
                () -> assertEquals(-7,calculadora.restar(-2,5)),
                () -> assertEquals(1,calculadora.restar(1,0)),
                () -> assertEquals(-32,calculadora.restar(70,102)),
                () -> assertEquals(0,calculadora.restar(0,0))
        );
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        //Creamos el objeto que vamos a usar
        Calculadora calculadora = new Calculadora();
        //Utilizamos el método assertAll
        assertAll(
                () -> assertEquals(30,calculadora.multiplicar(6,5)),
                () -> assertEquals(-10,calculadora.multiplicar(-2,5)),
                () -> assertEquals(0,calculadora.multiplicar(1,0)),
                () -> assertEquals(7140,calculadora.multiplicar(70,102)),
                () -> assertEquals(0,calculadora.multiplicar(0,0))
        );
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        //Creamos el objeto que vamos a usar
        Calculadora calculadora = new Calculadora();
        //Utilizamos el método assertAll
        assertAll(
                () -> assertEquals(6,calculadora.dividir(6,1)),
                () -> assertEquals(0,calculadora.dividir(0,20)),
                () -> assertEquals(5,calculadora.dividir(20,4)),
                () -> assertEquals(-2,calculadora.dividir(-4,2)),
                () -> assertEquals(48,calculadora.dividir(144,3))

        );
    }
}