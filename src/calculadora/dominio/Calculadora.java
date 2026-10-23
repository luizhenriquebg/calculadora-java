package calculadora.dominio;

public class Calculadora {
    public void soma(double n1, double n2) {
        System.out.println(n1 + n2);
    }

    public void multiplicacao(double n1, double n2) {
        System.out.println(n1 * n2);
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1/n2;
    }

    public void subtracao(double n1, double n2) {
        System.out.println(n1 - n2);
    }

    public void porcentagem(double n1, double n2) {
        System.out.println(n1 * n2 / 100);
    }
}
