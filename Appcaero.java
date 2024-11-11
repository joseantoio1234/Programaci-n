import java.util.Scanner;

public class Appcaero {

    public static int saldo = 0;
    public static int totalIngresado = 0;
    public static int totalRetirado = 0;
    public static int contadorIngresos = 0;
    public static int contadorRetiros = 0;
     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        int opcion = scanner.nextInt();
     
        do{

            System.out.println(menuInterfaz());
                        Scanner sc;
                                    opcion = sc.nextInt();
                        switch (opcion) {
                            case 1-> mostrarSaldo();
                            case 2-> depositarDinero();
                            case 3-> retirarDinero();
                            case 4-> {System.out.println("\nGracias por usar nuestro cajero automático. ¡Hasta luego!");
                                     System.out.println("\n--------------ESTADÍSTICAS DE USO--------------");
                                    System.err.println("Número total de Ingresos:     " + contadorIngresos);
                                    System.err.println("Importe total Ingresado:     $" + totalIngresado);
                                    System.err.println("Número total de Retiradas:    " + contadorRetiros);
                                    System.err.println("Importe total Retirado:      $" +  totalRetirado);
                                    System.err.println("Saldo Final en cuenta:       $" +  saldo);
                                    System.out.println("-----------------------------------------------");
                                                                                    
                                                                            
                     }
                                                                            
                             default -> System.out.println("Opcion invalida. Por favor, introduce un numero entre el 1 y 4 " );
                                                                        
            }
                                                            
                                                            
                    } while (opcion != 4);
                }
                                                            
                                                            
                                                            
                                                                 
                                                            
                private static char[] menuInterfaz() {
            
                    throw new UnsupportedOperationException("Unimplemented method 'menuInterfaz'");
                }
            
            
            
            
            
                private static Object mostrarSaldo() {
                     
                        throw new UnsupportedOperationException("Unimplemented method 'mostrarSaldo'");
                    }
                
                
                
                
                
        private static Object depositarDinero() {
                 
         throw new UnsupportedOperationException("Unimplemented method 'depositarDinero'");
     }
                
                
                
                
                
        private static Object retirarDinero() {
                    
        throw new UnsupportedOperationException("Unimplemented method 'retirarDinero'");
     }
                
                      
                        double saldo = 0.0;
    boolean salir;
        private Object opcion;
        while (!salir) {
            System.out.println(" -------------------------- ");
            System.out.println("|     Cajero automatico    |");
            System.out.println("|                          |");
            System.out.println(" -------------------------- ");
            System.out.println("|   1. Consultar saldo     |");
            System.out.println("|   2. Depositar dinero    |");
            System.out.println("|   3. Retirar dinero      |");
            System.out.println("|   4. Salir               |");
            System.out.println(" -------------------------- ");
            System.out.println("Elija una opcion ");
            int (opcion) = scanner.nextInt();
        

        switch (opcion) {
            case 1:
            System.out.println("Su saldo actual es: €" + saldo);
                break;

            case 2:
            System.out.println("Ingrese la cantidad a depositar: €");
            final double deposito = scanner.nextDouble();
            if (deposito > 0) {
                saldo += deposito;
                System.out.println("Ha depositado: €" + deposito);
                System.out.println("Nuevo saldo: €" + saldo);
            System.out.println("Nuevo saldo: €" + saldo);
            } else {
                System.out.println("Ingrese dinero");
            }
            break;

            case 3:
            System.out.println("Ingrese la cantidad a retirar: €");
            double retiro = scanner.nextDouble();
                if (retiro <= saldo){
                    saldo -= retiro;
                    System.out.println("Retiro existoso. Saldo restante: €" + saldo);
            } else {
                System.out.println("Fondos insuficientes");
            }
            break;



        
        default:
            System.out.println("Opcion no valida. Por favor seleccione una opcion valida.");    
                break;
        }

        
    }

        scanner.close();
   
    }




    

