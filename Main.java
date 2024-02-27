public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuentaBancaria = new CuentaBancaria();

        cuentaBancaria.crearCuenta();

        cuentaBancaria.ingresar(500);

        cuentaBancaria.retirar(500);

        cuentaBancaria.extraccionRapida();
    }
}