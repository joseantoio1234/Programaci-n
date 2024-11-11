import java.util.Scanner;

public class Appteoriadefunciones {
  public static void main(String[] args) throws Exception {
    int parametroEj;
    int parametro2;
    int resultado = funciónEjemplo(20, 45);
    System.out.println("El resultado de la llamada a la funcion es: " + resultado);
    Math.sqrt(75);
    }
 
    /**
     * La función suma los dos parametros, Despues suma 10 y devuelve el numero.
     * @param parametroEj - int - El primero oprador de la suma
     * @param parametro2 - int - El segundo operaodr de la suma.
     * @return la suma de los dos parametros + 10
     */
    public static int funciónEjemplo(int parametroEj, int parametro2){
      int numero = parametroEj + parametro2 + 10;
      return numero;

          Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int resultado = numero << 1; // Desplazamiento de bits para multiplicar por 2

        System.out.println("El resultado es: " + resultado);






    }
}

