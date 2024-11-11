import java.util.Scanner;

public class App5 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double nota1 = 5.25;
    double nota2 = 7.85;
    double nota3 = 3.4;
    double media = calcularMedia(nota1, nota2, nota3);
    double notaFinal = media + 1;

    System.out.println("La media de las notas es: " + media);
    System.out.println("Nota final con el punto extra: " + notaFinal);

    System.out.print("Dame un número: ");
    int numero = sc.nextInt();
    System.out.println("El resultado es: " + resultado(numero));

    System.out.print("Dame un número: ");
    int numero2 = sc.nextInt();
    System.out.print("Dame un número: ");
    int numero3 = sc.nextInt();
    System.out.println("El resultado es: " + resultado2(numero2, numero3));
  
}

/**
     * La funcion suma de las tres notas, las divides entre 3 y les uma 1 dando la media  .
     * @param nota1 es el primer operador 
     * @param nota2 es el segundo operador
     * @param nota3 es el tercer operador 
     * @return Lo que devuelve es la media de las notas
     */

public static double calcularMedia(double nota1, double nota2, double nota3) {
  double suma = (nota1 + nota2 + nota3);
  double media = suma / 3 + 1; 
  return media;
}
/**
 * 
 * @return el resultado
 */
  public static int resultado(int numero){
  int resultado = numero << 1;
  return resultado;
}

  /**
   * 
   * 
   * @return el resultado
   */
  public static int resultado2(int numero2, int numero3){
  int resultado2 = numero2 / numero3;
  return resultado2;
  }



public static int numeroMasGrande(){
  return Integer.MAX_VALUE;





}

}




