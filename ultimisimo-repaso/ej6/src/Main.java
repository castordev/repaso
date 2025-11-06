
//6. Crea una función que recorra una matriz y devuelva en un array el número
//mayor y el menor.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [][] matrix ={
                {4,5,1},
                {2,8,3},
                {7,3,2}
        };

        System.out.println(Arrays.toString(minmax(matrix)));

    }

    public static int[] minmax (int [][] matrix){

        int max = matrix[0][0];
        int min = matrix[0][0];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {


                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min ){
                    min = matrix[i][j];
                }
            }
        }

        // el array despues del bucle porque si no seria minmax = { 4, 4 } ya que es el [0][0]
        int [] minmax = {min,max};

        return minmax;
    }

}