import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    // Constructor con parámetros
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Constructor sin parametros(por defecto)
    public Operacion() {
    }

    // Metódos getter y setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Metódo para crear operacion
    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        this.setNumero1(sc.nextDouble());
        System.out.println("Introduce el segundo número:");
        this.setNumero2(sc.nextDouble());
        sc.close();
    }

    // Metódo sumar
    public double sumar() {
        double suma = this.getNumero1() + this.getNumero2();
        System.out.print("El resultado de la suma es: ");
        return suma;
    }

    // Metódo restar
    public double restar() {
        double resta = this.getNumero1() - this.getNumero2();
        System.out.print("El resultado de la resta es: ");
        return resta;
    }

    // Metódo multiplicar
    public double multiplicar() {
        if ((this.getNumero2() == 0) || (this.getNumero1() == 0)) {
            System.out.println("ERROR: No se puede multiplicar por cero");
            return 0;
        } else {
            double multiplicacion = this.getNumero1() * this.getNumero2();
            System.out.print("El resultado de la multiplicación es: ");
            return multiplicacion;
        }
    }

    // Metódo dividir
    public double dividir() {
        if ((this.getNumero2() == 0) || (this.getNumero1() == 0)) {
            System.out.println("ERROR:No se puede dividir por cero");
            return 0;
        } else {
            double division = this.getNumero1() / this.getNumero2();
            System.out.print("El resultado de la división es: ");
            return division;
        }
    }
}
