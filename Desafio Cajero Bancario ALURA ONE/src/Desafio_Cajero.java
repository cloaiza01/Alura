import java.util.Scanner;
public class Desafio_Cajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldoTotal = 23950.55;
        double depositarDinero = 0;
        double retirarDinero = 0;
        String usuario = "";
        String contrasenia = "";
        String tipoCuenta = "Normal";
        String tipoCambio = "$ ";
        int opcion = 0;
        String menuCajero = """
                "***   Bienvenido Sr. Tony Stark, que desea hacer:   ***
                 1.- Consultar Saldo.
                 2.- Depositar Dinero.
                 3.- Retirar Dinero.
                 9.- Salir.""
                 **************************************************************************""";
        String ingresarUsuario = "Ingrese su usuario Sr Tony para poder hacer transacciones en este cajero:";
        String ingresarContrasenia = "Ingrese su contraseña para saber que es usted por favor:";

        System.out.println(ingresarUsuario);
        usuario = teclado.nextLine();
        System.out.println(ingresarContrasenia);
        contrasenia = teclado.nextLine();

        if (usuario.equals("Tony_Stark") && contrasenia.equals("0186")) {
            while (opcion != 9) {
                System.out.println(menuCajero);
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("El saldo actual de su cuenta es: " + tipoCambio + saldoTotal);
                        System.out.println("Su tipo de cuenta es: " + tipoCuenta);
                        System.out.println("""
                                Para regresar al menú anterior presione 6
                                Para Salir presione 9""");
                        opcion = teclado.nextInt();
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a depositar:");
                        depositarDinero = teclado.nextDouble();
                        System.out.printf("Procesando depósito......");
                        for (int contador = 0; contador <= 9; contador++) {
                            System.out.println(contador);
                        }
                        int suma = (int) (saldoTotal + depositarDinero);
                        System.out.println("Terminado, el saldo total en su cuenta es de: " + tipoCambio + suma);
                        System.out.println("""
                                Para regresar al menú anterior presione 6
                                Para Salir presione 9""");
                        opcion = teclado.nextInt();
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad a retirar:");
                        retirarDinero = teclado.nextDouble();
                        if(saldoTotal < retirarDinero){
                            System.out.println("No puede retirar esa cantidad, saldo insuficiente.....");
                            System.out.println("""
                                Para regresar al menú anterior presione 6
                                Para Salir presione 9""");
                            opcion = teclado.nextInt();
                        } else {
                            int resta = (int) (saldoTotal - retirarDinero);
                            System.out.println("Se retiran : " + tipoCambio + retirarDinero + " quedando en su cuenta : " + tipoCambio + resta);
                            System.out.println("""
                                    Para regresar al menú anterior presione 6
                                    Para Salir presione 9""");
                            opcion = teclado.nextInt();
                        }
                        break;
                    case 6:

                        opcion = teclado.nextInt();
                        break;
                    case 9:
                        System.out.println("Gracias Sr. Tony Stark por haber ocupado mis servicios, hasta la próxima.....");
                        break;


                }
            }
        }
        else{
            System.out.println("Usted no es Tony Stark, no moleste mas este cajero");
        }
    }
}



