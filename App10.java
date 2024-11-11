import java.util.Scanner;

public class App10 {    
     Scanner doublescanner = new Scanner(System.in);


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número: ");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            if (EsMultiplo(num1, num2) || EsMultiplo(num2, num1)) {
                System.out.println("Alguno de los números es múltiplo del otro.");
            } else {
                System.out.println("Ninguno de los números es múltiplo del otro.");
            }
        }
    }

    public static boolean EsMultiplo(int num1, int num2)
        return num2 != 0 && num1 % num2 == 0;
    



System.out.println("Ingrese el número de días: ");
Scanner scanner;
int dias = scanner.nextInt();

for (int i = 0; i < dias; i++) {
    System.out.println("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
    int max = scanner.nextInt();
    System.out.println("Ingrese la temperatura mínima del día " + (i + 1) + ": ");
    int min = scanner.nextInt();

    double media = CalcularMedia(max, min);
    System.out.println("La temperatura  media del día " + (i + 1) + " es: " + media);



public static double CalcularMedia(int max, int min) {
return (max + min) / 2.0;
}

private Scanner scanner;

}
public static ConvertirEspaciado

System.out.println("Ingrese un texto: ");
String texto = scanner.nextLine();
String resultado = ConvertirEspaciado(texto);
System.out.println(resultado);


public static String ConvertirEspaciado(String texto) {
StringBuilder resultado = new StringBuilder();
for (int i = 0; i < texto.length(); i++) {
    resultado.append(texto.charAt(i));
    resultado.append(" ");
}
return resultado.toString().trim();
}
int
System.out.print("Ingrese el radio de la circunferencia: ");
double radio = scanner.nextDouble();

Circunferencia.calcular(radio);
}

