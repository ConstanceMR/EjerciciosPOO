
public class Main {
    public  static void main(String[] args) throws Exception{
       Operacion operacion = new Operacion();

       operacion.crearOperacion();
       
       System.out.println(operacion.sumar());
       System.out.println(" ");
        
       System.out.println(operacion.restar());
       System.out.println(" ");

       System.out.println(operacion.multiplicar());
       System.out.println(" ");
      
       System.out.println(operacion.dividir());
       System.out.println(" ");
    }
}
