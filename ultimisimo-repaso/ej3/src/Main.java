
//3. Escribe una función que se llame sumRow y devuelva en un array la suma
//de cada fila.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [][] matrix ={
                {4,5,1},
                {2,8,3}
        };

        System.out.println(Arrays.toString(sumRow(matrix)));

    }


    public static int[] sumRow (int [][] matrix){

        int suma ;

        int[] array = new int[matrix.length];

        for( int i = 0 ; i < matrix.length ; i++){
            suma = 0;
            for(int j = 0 ; j <matrix[0].length ; j++){

                suma = suma + matrix[i][j];
            }
            array[i] = suma;
        }

        return array;
    }

}