import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime que ejercicio quieres que ir, ejemplo 1 vas al primero");
        String menu = scanner.nextLine();
        switch(menu) {

        case "1":
    System.out.println("Pide un numero");
    int numero = scanner.nextInt();
    scanner.close();

    if (numero % 3 == 0) {
        System.out.println(numero + "es multiplo de 3. ");
    }
    else {
        System.out.println(numero + "no es multiplo de 3.");

    System.out.println("dime que ejercicio quieres que ir, ejemplo 2 vas al segundo");

    System.out.print("Pide el primer número: ");
    int numero1 = scanner.nextInt();
        
    System.out.print("Pide el segundo numero: ");
     int numero2 = scanner.nextInt();
        
    System.out.print("Pide el tercer numero: ");
    int numero3 = scanner.nextInt();

    scanner.close();

    int mayor = numero1;

    if (numero2 > mayor) {
        mayor = numero2;
    }

    if (numero3 > mayor) {
        mayor = numero3;
    }

    System.out.println("El mayor de los tres números es: " + mayor);

    System.out.print("Pide la hora "); 
    int hora = scanner.nextInt();

    System.out.print("Pide la hora "); 
    int minutos = scanner.nextInt();

    System.out.print("Pide la hora "); 
    int segundos = scanner.nextInt();

    if(hora >= 0 || hora <= 24) {
        System.out.println("La hora ingresada no es válida. Por favor, ingrese una hora entre 0 y 23.");
        
    }

    if(minutos >= 0 || minutos <=59){
        System.out.println(" Los minutos ingresados no son validos. Por favor, igrese unos minutos entre 0 y 59");


    if(segundos >=0 || segundos <=59) {
        System.out.println("Los segundos ingresados no son validos. Por favor, ingrese unos segundos entre 0 y 59");
    
    
        System.out.printf("Hora ingresada: %d:%d:%d%n", hora, minutos, segundos);

        System.out.println("dime que ejercicio quieres que ir, ejemplo 4 vas al cuarto");

        System.out.println("Introduce un numero de mes (1-12)");
        int mes = scanner.nextInt();

        if (mes <1 || mes > 12){
            System.out.println("El valor introducido tiene que estar entre 1 y 12.");   
            return;
    }

        String nombremes = "";

        switch (mes) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                nombremes = "31 dias";
                break;
        }

        System.out.println("El mes " + mes + "tiene" + nombremes);
     
        System.out.println("dime que ejercicio quieres que ir, ejemplo 5 vas al quinto");

        System.err.println("Introduce la nota de la primera evaluacion");
        double nota1 = scanner.nextDouble();

        System.err.println("Introduce la nota de la segunda evaluacion");
        double nota2 = scanner.nextDouble();

        System.err.println("Introduce la nota de la tercera evaluacion");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 5) {
            System.out.printf("La nota final es: %.2f", media);
        } else {
            System.out.println("Debe recuperar la evaluacion");
        
        System.out.println("dime que ejercicio quieres que ir, ejemplo 6 vas al sexto");

        System.out.println("Introduce el numero de horas trabajadas este mes");
        int horas = scanner.nextInt();

        double sueldo = 0;

        if (horas <= 150) {
            sueldo = horas *10;
        } else {

        sueldo = 150 * 10 + (horas - 150) * 20;
    }   
         System.out.printf("El sueldo total es: %.2f€, sueldo"); 



         System.out.println("dime que ejercicio quieres que ir, ejemplo 7 vas al septimo");

        System.out.println("Introduce un numero");
        int numero4 = scanner.nextInt();

        if (numero4 % 2 == 0) {
            System.out.println("El numero es par");
         } else {
            System.err.println("El numero es impar");


            
        System.out.println("dime que ejercicio quieres que ir, ejemplo 8 vas al octabo");
        
        System.out.println("Introduce un numero entre 1 y 10");
        int numero5 = scanner.nextInt();

        switch (numero5) {
            case 0:
                System.out.println("Cero");
            break;

            case 1:
                System.out.println("Uno");
            break;

            case 2:
                System.out.println("Dos");
            break;

            case 3:
                System.out.println("Tres");
            break;

            case 4:
                System.out.println("Cuatro");
            break;

            case 5:
                System.out.println("Cinco");
            break;

            case 6:
                System.out.println("Seis");
            break;

            case 7:
                System.out.println("Siete");
            break;

            case 8:
                System.out.println("Ocho");
            break;

            case 9:
                System.out.println("Nueve");
            break;

            case 10:
            System.out.println("Diez");
        break;
    default: System.out.println("error");
        System.out.println("Numero incorrecto");

        }


        System.out.println("dime que ejercicio quieres que ir, ejemplo 9 vas al noveno");

        System.err.println("Introduce un nombre en letras (Cero, Uno, Dos, Tres, Cuatro, Cienco, Seis, Siete, Ocho, Nueve, Diez): ");
        String nombreNumero = scanner.nextLine();


    switch (nombreNumero) {
        case "Cero":
                System.out.println("0");
            break;

            case "Uno":
                System.out.println("1");
            break;

            case "Dos":
                System.out.println("2");
            break;

            case "Tres":
                System.out.println("3");
            break;

            case "Cuatro":
                System.out.println("4");
            break;

            case "Cinco":
                System.out.println("5");
            break;

            case "Seis":
                System.out.println("6");
            break;

            case "Siete":
                System.out.println("7");
            break;

            case "Ocho":
                System.out.println("Ocho");
            break;

            case "Nueve":
                System.out.println("9");
            break;

            case "Diez":
            System.out.println("10");
            break;
        default:
        System.out.println("Nombre de numero no invalido");    

    }

    System.out.println("dime que ejercicio quieres que ir, ejemplo 10 vas al decimo");

    System.out.println("Introduce un año");
    int año = scanner.nextInt();

    if (año < 0 ){
        System.out.println("No se puede meter años en negativos. ");
    } else {
    if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0 )) {
        System.out.println(año + "es un año bisiesto.");
    } else {
        System.out.println(año + "no es un año bisiesto");

             }
            }
           }
          }
         }
        }
       }
      }
     }

    }


    


    
            








        











    






    

    



   


    


   


