
//2: Pedir un número N, y mostrar todos los números del 1 al N

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int N = sc.nextInt();

        // <= para que salga el numer N tambien

        for(int i = 1 ; i <= N ;i++){

            System.out.println(i);

        }


    }
}