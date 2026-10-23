package calculadora.aplicacao;

import calculadora.dominio.Calculadora;

public class CalculadoraTest {
    static void main() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(10,0);
        System.out.println(result);
    }
}
