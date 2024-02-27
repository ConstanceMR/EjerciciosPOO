public class Main {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(3, 4);

       
        System.out.println("El area del circulo es:  " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es:  " + circulo.calcularPerimetro());

        System.out.println("El area del rectangulo es:  " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es:  " + rectangulo.calcularPerimetro());
    }

} 
