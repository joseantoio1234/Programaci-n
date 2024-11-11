import java.util.Scanner;
public class App4 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();
    System.out.println("Bienvenido " + nombre );
    
    System.out.print("Introduce la contraseña");
    String correctPassword = "123456";
    String contraseña = sc.nextLine();
    System.out.println(contraseña.equals(correctPassword));
    
    Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scan.nextLine();

        int longitud = frase.length();
        char primeraLetra = frase.charAt(0);
        char ultimaLetra = frase.charAt(longitud - 1);

        System.out.println("Longitud de la frase: " + longitud);
        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Última letra: " + ultimaLetra);

        System.out.println("Escribe la frase: Hola amigo ¿como estas?");
        String frase2 = sc.nextLine();
        System.out.println(frase2.substring(5,10));

    sc.close();

      
    }

}

