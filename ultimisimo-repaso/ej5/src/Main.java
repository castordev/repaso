
//5. Crea una función que se le pasa una matriz como argumento y tiene que
//devolver la misma matriz, pero cambiando la primera fila por la última.
//Además, todos los elementos pares de la matriz deben de volverse
//impares

public class Main {
    public static void main(String[] args) {

        int [][] matrix ={
                {4,5,1},
                {2,8,3},
                {7,3,2}
        };

        System.out.println(reverse(matrix));

    }


    public static int[][] reverse (int [][] matrix){

        //hacemos un array para almacenar
        int [][] reverse = new int[matrix.length][matrix[0].length];

        // filasmax sera la distancia vertical -1 ya que la matriz empezara a contar desde 0
        int filasmax = matrix.length-1;

        //cambiamos la ultima fila por la primera fila y viceversa
        // guardamos la primera fila en un temporal
        int[] temp = matrix[0];

        // le decimos que matrix[0] es igual a matrix[filamax], ya que filamax es la distancia vertical
        // de la matriz, así nos llevaria a matrix[x] donde x es la ultima columna
        matrix[0]= matrix[filasmax];

        // ahora le decimos que la ultima fila es igual al temporal, que es la primera linea almacenada
        matrix[filasmax] = temp;



        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0; j < matrix[0].length ; j++) {
                if(matrix[i][j] %2 == 0){
                    matrix[i][j] = matrix[i][j] + 1 ;
                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        return  reverse;

    }

}