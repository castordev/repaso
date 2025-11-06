
//Escribe una función que se llame sumRow y devuelva en un array la suma
//de cada columna

public class Main {
    public static void main(String[] args) {

        int [][] matrix ={
                {4,5,1},
                {2,8,3}
        };


    }



    public static int sumColumn (int [][] matrix){

       int suma ;

        int [] columnas = new int[matrix[0].length];

       for( int i = 0 ; i < matrix.length ; i++){

           suma = 0;

           for (int j = 0; j < matrix[0].length; j++) {

           }
           suma = suma + matrix[i][0];
           columnas[i] = suma;
       }

    }
}