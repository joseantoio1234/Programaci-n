import java.util.Scanner;
public class Apprepaso {
public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int cantidad = sc.nextInt();

            int positivos = 0;
            int negativos = 0;
            int ceros = 0;
            int pares = 0;
            int impares = 0;

            for (int i = 0; i < cantidad; i++); {
                int numero = sc.nextInt();

                if(numero > 0) {
                    positivos++;
                } else if (numero < 0 ) {
                    negativos++;
                } else {
                    ceros++;
                }

                if (numero % 2==0) {
                    pares++;
                } else {
                    impares++;
                }
           }

            System.out.printf("Cantidad de numeros positivos:", positivos);    
            System.out.printf("Cantidad de numeros negativos", negativos);
            System.out.printf("Cantidad de numeros ceros", ceros);
            System.out.printf("Cantidad de numeros pares", pares);
            System.out.printf("Cantidad de numeros impares", impares);

            sc.close();
        }




    }



 
















            
    
    



    

