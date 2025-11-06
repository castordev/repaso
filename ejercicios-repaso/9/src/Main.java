

// 4: Pedir solo un número. Determinar si es un número es primo o no.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero:");

        int n = sc.nextInt();

        if(esPrimo(n)){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }

        sc.close();

    }
    public static boolean esPrimo ( int n){

        // 0, 1 y los numeros negativos no son primos
        if( n <= 1 ) return false;

        // 2 es primo
        if( n == 2 ) return true;

        // numeros pares mayores que 2 no son primos
        if( n %2 == 0) return false;


        // empezamos desde el 3 porque ya declaramos del 2 para abajo
        // mientras i sea menor  que n, ya que no son divisibles por numeros mayores que ellos
        // i = i + 2 siginifca que el bucle ira de dos en dos a partir del 3, asi nos saltamos los pares
        for ( int i = 3 ;  i < n ; i += 2){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

}