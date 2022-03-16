import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el Primer valor");
        Scanner scaner = new Scanner(System.in);
        int numero1 = scaner.nextInt();
        System.out.println("Ingrese el Segundo valor");
        Scanner scaner1 = new Scanner(System.in);
        int numero2 = scaner.nextInt();
        int opcion = 0;
        do {
            System.out.println("Seleccione la operacion");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");

            Scanner scaner3 = new Scanner(System.in);
            opcion = scaner.nextInt();
            switch (opcion){
                case 1: System.out.println(sumar(numero1,numero2));
                    break;
                case 2: System.out.println(restar(numero1,numero2));
                    break;
                case 3: System.out.println(multiplicar(numero1,numero2)); break;
                case 4:
                    if(numero1>0 && numero2>0) System.out.println(dividir(numero1,numero2));
                    else System.out.println("El divisor y el dividendo deven ser mayor a zero");
                    break;
                default: System.exit(0); break;
            }
        }while (opcion<5);


    }
    public static int sumar(int num1,int num2){
        return num1+num2;
    }
    public static int restar(int num1,int num2){
        return num1-num2;
    }
    public static int multiplicar(int num1,int num2){
        int a=0;
        int con=num2;
        while(con>0){
            a+=sumar(num1,0);
            con--;
        }
        return a;
    }
    public static int dividir(int num1,int num2){
        int a=num1;
        int con=0;
        while(num2<=a){

            a=restar(a,num2);
            con++;
        }
        return con;
    }
}

