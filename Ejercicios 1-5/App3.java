import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(System.in);
            
            System.out.println("Dame un numero");
            int numero1 = sc.nextInt();
            System.out.println("Dame otro numero");
            int numero2 = sc.nextInt();
            int suma = numero1+numero2;
            System.out.println("La suma de los numeros es :"+suma);

            System.out.println("Dame un numero");
            int numero3 = sc.nextInt();
            System.out.println("Dame otro numero");
            int numero4 = sc.nextInt();
            int resta = numero3-numero4;
            System.out.println("La resta de los numeros es :"+resta);
            
            System.out.println("Dame un numero");
            int numero5 = sc.nextInt();
            System.out.println("Dame otro numero");
            int numero6 = sc.nextInt();
            int multiplicacion = numero3*numero4;
            System.out.println("La multiplicacion de los numeros es :"+multiplicacion);
            
            int numero7 = sc.nextInt();
            double raiz = Math.sqrt(numero7);
            System.out.println("La raiz cuadrada de " + numero7 + " es " + raiz);
          
            int base = sc.nextInt();
            int exponente = sc.nextInt(); 
            System.out.println("La base " + base + " el exponente ");
            + exponente + " da " + Math.pow(base,exponente);
          
          int radio = sc.nextInt();
          float perimetro = 2*radio*3*Math.PI;
          double area = Math.PI*radio*radio;
    
            sc.close();


     }
 }