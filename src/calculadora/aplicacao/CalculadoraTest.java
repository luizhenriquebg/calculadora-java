package calculadora.aplicacao;

import calculadora.dominio.Calculadora;

public class CalculadoraTest {
    static void main() {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(10, 20);
        calculadora.subtracao(25, 10);
        calculadora.divisao(15, 37);
        calculadora.multiplicacao(7, 9);
        calculadora.porcentagem(200, 15);
    }
}
