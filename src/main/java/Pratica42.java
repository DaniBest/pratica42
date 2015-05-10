
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/**
 *
 * @author DANIEL
 */
public class Pratica42 {

    public static void main(String[] args) {
        Elipse elipse = new Elipse(3, 8);
        Circulo circulo = new Circulo(4);

        System.out.println("Área de " + elipse + " = " + elipse.getArea());
        System.out.println("Perímetro de " + elipse + " = " + elipse.getPerimetro());
        System.out.println("Área de " + circulo + " = " + circulo.getArea());
        System.out.println("Perímetro de " + circulo + " = " + circulo.getPerimetro());
    }

}
