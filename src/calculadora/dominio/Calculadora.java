package calculadora.dominio;

public class Calculadora {
    public void soma(double n1, double n2) {
        System.out.println(n1 + n2);
    }

    public void multiplicacao(double n1, double n2) {
        System.out.println(n1 * n2);
    }

    public void divisao (double n1, double n2) {
        System.out.println(n1 / n2);
    }

    public void subtracao (double n1, double n2) {
        System.out.println(n1 - n2);
    }

    public void porcentagem (double n1, double n2) {
        System.out.println(n1 * n2 / 100);
    }
}
