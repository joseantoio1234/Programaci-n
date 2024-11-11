import java.util.Scanner;

public class App7 {
    public static void main(String[] args)  {
        System.out.println("Bucles");


        Scanner sc = new Scanner(System.in);


        int i = 0;                         //Contador
        boolean seguimos = true;           //Bandera
        while(seguimos){                  
            System.out.println("ESTAMOS EN BUCLE - iteracion: " + i);
            i++;

            if (i==10){
                seguimos = false;

            //Ejmplo
            int sumador = 0;
            boolean notSeguimos;
            notSeguimos = false;
            
            int sumador;
            sumador = 0;                  //Acumulador
            while(){
                int numero = sc.nextInt();
                if (numero==0){
                    notSeguimos=true;
                }else{
                    sumador+=numero;            //sumador=sumador+numero
                }
                
            }
        
            System.out.println(sumador);
            sc.close();
        }

    }
}
}

    


        









    

