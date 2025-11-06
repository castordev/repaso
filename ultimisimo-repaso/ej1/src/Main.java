
//1. Crea un programa que llene una matriz de 2x2 con números ingresados por
//el usuario y luego imprima todos los elementos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int[2][2];

        for (int i = 0 ; i < matrix.length ; i++ ){
            for (int j = 0 ; j < matrix[0].length ; j++){

                // por algun motivo esto funciona
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("matriz");

        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){

                //sout sin ln en el print para que no salte de linea
                System.out.print(matrix[i][j] + " ");
            }
            //al salir del primer bucle saltamos de linea para que la matriz siga en la linea de abajo
            System.out.println();
        }

    }
}