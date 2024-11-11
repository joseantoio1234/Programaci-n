import java.io.PrintStream;
import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        for (int horas = 0; horas < 24; horas++){
            for (int min = 0; min < 60; min++) {
                for (int seg = 0; seg < 60; seg++) {
                    System.out.println(horas + ":" + min + ":" + seg);
                        try{
                            Thread.sleep(1000);  
                        } catch (InterruptedException e ) {

                            e.printStackTrace();
            
            
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la base (número real): ");
        Object scanner;
        double base = ((Scanner) scanner).nextDouble();
        
        
        System.out.print("Introduce el exponente (entero positivo): ");
        Object Scanner;
        int exponente = ((Scanner) ).nextInt();
        
 
        if (exponente < 0) {
            System.out.println("El exponente debe ser un entero positivo.");
            return;
        }
        
        
        double resultado = 1.0;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        
      
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
        
        ((PrintStream) scanner).close();

        System.out.print("Por favor, introduce una frase: ");
        String frase = ((Scanner) scanner).nextLine();

        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }

        ((PrintStream) scanner).close();




        boolean limiteIncorrecto = true;
        int inferior, superior;

        while (limiteIncorrecto) {
            System.out.print("Por favor, introduce el límite inferior del intervalo: ");
            inferior = ((Scanner) scanner).nextInt();

            System.out.print("Por favor, introduce el límite superior del intervalo: ");
            superior = ((Scanner) scanner).nextInt();

            if (inferior > superior) {
                System.out.println("El límite inferior no puede ser mayor que el límite superior. Vuelve a intentarlo.");
            } else {
                limiteIncorrecto = false;
            }
        }

        int suma = 0;
        int fueraDelIntervalo = 0;
        boolean igualAInferior = false;
        boolean igualASuperior = false;

        int numero = ((Scanner) scanner).nextInt();

        while (numero != 0) {
            if (numero < inferior || numero > superior) {
                fueraDelIntervalo++;
            }

            if (numero == inferior) {
                igualAInferior = true;
            }

            if (numero == superior) {
                igualASuperior = true;
            }

            suma += numero;
            numero = ((Scanner) scanner).nextInt();
        }

        System.out.println("La suma de los números dentro del intervalo es: " + suma);
        System.out.println("Cantidad de números fuera del intervalo: " + fueraDelIntervalo);
        System.out.println("Se introdujo algún número igual a los límites del intervalo: " +
                (igualAInferior || igualASuperior));

        ((PrintStream) scanner).close();


        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 10;

        System.out.println("Adivina el número entre 1 y 100");

        while (intentos > 0) {
            System.out.print("Introduce un número: ");
            int numeroUsuario = ((Scanner) scanner).nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Lo has adivinado! El número era " + numeroAleatorio);
                break;
            }

            intentos--;
            System.out.println("Te quedan " + intentos + " intentos");
        }

        if (intentos == 0) {
            System.out.println("Has agotado todos los intentos. El número era " + numeroAleatorio);
        }

        ((PrintStream) scanner).close();
    }
}
    }
}





    }
}






    



                            



      

   
  
                
            
                
                
                
                 
 










                 