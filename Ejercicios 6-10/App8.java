import java.util.Scanner;

public class App8 {
    public static void main(String[] args)  {
        System.out.println("Bucles");
        Scanner sc = new Scanner(System.in);
        boolean funcionando = true;
        do{
            System.out.println("Elige un ejercicio");
            System.out.println("1-E 1");
            System.out.println("etc");
            int opcion = sc.nextInc();

        


Scanner scanner;
int numero = scanner.nextInt();



    if (numero < 0) {
        break;
    }

    int cuadrado = numero * numero;    

    System.out.println("El cuadrado de " + numero + "es" + cuadrado);

    Scanner input;
    input.close();



}
Scanner sc = new Scanner(System.in);

int suma = 0;
        int cantidad = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número (negativo para calcular la media): ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            suma += numero;
            cantidad++;
            System.out.print("Ingrese otro número (negativo para calcular la media): ");
            numero = scanner.nextInt();
        }

        double media = (double) suma / cantidad;
        System.out.printf("La media es: %.2f", media);
    }





int x = 100;

while (x > 0){
    System.out.println("El numero resultante es :" + x );
    x = x - 7;
}


int contadoruno = 0;
int numerosintroducidos = 0;
int sumanumintro = 1;

while (numerosintroducidos < 10 ) {

    if(contadoruno %2!=0){
        System.out.println("Este numero es impar: " + contadoruno);
        numerosintroducidos++;
        sumanumintro = sumanumintro * contadoruno;
    }
    contadoruno++;
}
System.out.println("El resultado de la multiplicacion es : " + sumanumintro);



int sumaPositivos = 0, sumaNegativos = 0, cantidadCeros =0, cantidadPositivos =0, cantidadNegativos =0;

for (int contadordos = 0; contadordos < 10; contadordos++ ) {
    System.out.println("Dame un numero : ");
    Scanner sc;
    int p = sc.nextInt();

    if (p > 0) {
        sumaPositivos = sumaPositivos + p;
        cantidadPositivos++;
    } else if (p < 0) {
        sumaNegativos = sumaNegativos + p;
        cantidadNegativos++;
    } else {
        cantidadCeros++;
    }
    }

    System.out.println("La media de numeros positivos es " + (sumaPositivos / cantidadPositivos));
    System.out.println("La media de los numeros negativos es " + (sumaNegativos / cantidadNegativos));
    System.out.println("La cantidad de ceros es: " + cantidadCeros);


    System.out.println("Dame un numero entre 0 y 10");
                int numerotabla = sc.nextInt();

                for (int i = 1;
                private Scanner sc; i <= 10; i++) {
                    System.out.println(numerotabla + " x " + i + " = " + (numerotabla * i));
                }


    System.out.print("¿Cuántos sueldos desea ingresar?: ");
                int sueldos = sc.nextInt();
                double sueldoMaximo = Double.MIN_VALUE;
                
                for (int y = 0; y < sueldos; y++) {
                    System.out.print("Ingrese el sueldo " + (y + 1) + ": ");
                    double sueldo = sc.nextDouble();
        
                    if (sueldo > sueldoMaximo) {
                        sueldoMaximo = sueldo;
                    }
                }
                System.out.println("El sueldo máximo es: " + sueldoMaximo);

    int numeroa = 0;
                int numerob = 100;

                while(numeroa != numerob){
                    System.out.println("Introduce numero: ");
                    numeroa = sc.nextInt();

                if (numeroa < numerob) {
                    System.out.println("El numero es menor");
                }
                else if (numeroa > numerob){
                    System.out.println("El numero es mayor");
                }
                }
                    System.out.println("El numero es correcto");


    System.out.println("Dame un numero");
            int numerop = sc.nextInt();

            if (numerop <= 1){
                System.out.println("Este numero no es primo");
            }
            else{
                boolean esPrimo = true; 
                for(int i = 2; i < numerop; i++){
                    if (numerop %i==0){
                        esPrimo = false;
                    }
                }
                if(esPrimo){
                System.out.println("Este numero es primo");
                }
                else{
                    System.out.println("Este numero no es primo");
                }

            }
        

    

        int correctCombination = 1234;
        int attempts = 4;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("Ingrese la combinación: ");
            int userCombination = scanner.nextInt();

            if (userCombination == correctCombination) {
                System.out.println("Has abierto la caja fuerte");
                break;
            } else {
                attempts--;
                System.out.println("Clave incorrecta, le quedan " + attempts + " intentos");
            }
        }

        if (attempts == 0) {
            System.out.println("Lo siento has agotado las 4 oportunidades");
        
        
        sc.close();{

        }



    }

























        }
    



























    
