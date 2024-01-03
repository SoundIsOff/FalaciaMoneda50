import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Scanner teclado = new Scanner(System.in);
    private static double[][] list = new double[100][100];


    public static void main (String[] args){

        while(true){
            System.out.println("Tienes 50% de probabilidades de ganar el 80% de tu diner o de perder el 50% de este.");
            System.out.println("Escribe la cantidad de dinero que quieres apostar:");
            double dinero = teclado.nextInt();
            System.out.println("Escribe el numero de veces que quieres lanzar la moneda");
            int veces = teclado.nextInt();

            double resul = calcular(dinero,veces);

            if(resul<=dinero) System.out.println("Oops, la suerte no está de tu lado");

            System.out.printf("Total obtenido: %.2f",resul );
            System.out.println("Volver a jugar? -> [y/n]");
            if(!Objects.equals(teclado.next(), "y")) break;

        }
    }


    public static double calcular(double dinero, int veces){
        for( int i=0; i<=veces; i++){

            for( int j=0; i<=50; i++){
                 if(numRand()>=5) dinero += (dinero*80/100);
                 else dinero -= (dinero*50/100);

            }
        }
        return dinero;
    }

    public static void matriz(){
        int personas = 1;

        for (int i = 0; i<personas; i++){

        }
    }

    public static double numRand(){
        double i = Math.random()*10;
        return i;
    }
}
