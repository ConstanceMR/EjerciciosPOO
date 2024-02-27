import java.util.Scanner;

public class CuentaBancaria {
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;

    // Constructor por defecto
    public CuentaBancaria() {
    }

    // Constructor con parametros
    public CuentaBancaria(int numeroCuenta, long DNI, double saldoAcual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoAcual;
    }

    // Metódos getters y setters
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return this.DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return this.saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public void crearCuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de cuenta:");
        this.setNumeroCuenta(sc.nextInt());
        System.out.println("Introduce tu DNI (sin puntos ni guiones): ");
        this.setDNI(sc.nextLong());
        System.out.println("Introduce el saldo inicial: ");
        this.setSaldoActual(sc.nextDouble());
        sc.close();
        this.consultarDatos();
    }

    // Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    // ingresar y se la sumará al saldo actual.
    public void ingresar(double ingreso) {
        if (ingreso > 0) {
            saldoActual += ingreso;
            System.out.println("Se ha  ingresado " + ingreso);
            this.consultarSaldo();
        }
    }

    // Método retirar(double retiro): el método recibe una cantidad de dinero a
    // retirar y
    // se le restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    // retirar, se
    // pondrá el saldo actual en 0
    public void retirar(double retiro) {
        if (retiro >= saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }
        System.out.println("Se ha retirado " + retiro);
        this.consultarSaldo();
    }

    // Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
    public void extraccionRapida() {
        if (saldoActual > 0) {
            saldoActual -= (saldoActual * 0.20);
            System.out.println("Se ha realizado una extracción rápida del 20% de su saldo.");
            this.consultarSaldo();
        } else {
            System.out.println("No puede realizar una extracción rápida porque su saldo es cero.");
        }
    }

    // Método consultarSaldo(): permitirá consultar el saldo disponible en la
    // cuenta.
    public void consultarSaldo() {
        System.out.println("El saldo es: " + this.getSaldoActual());
    }

    // Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos() {
        System.out.println("Datos de la cuenta: numeroCuenta= " + getNumeroCuenta() +
                " , DNI= " + getDNI() +
                " , saldoActual= " + getSaldoActual());
    }
}
