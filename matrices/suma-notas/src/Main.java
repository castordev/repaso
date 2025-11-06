import java.util.Arrays;

// Tenemos un array bidimensional que representa un conjunto de alumnos. Cada fila del array representa a un alumno,
//y cada columna de esa fila contiene las notas del alumno en diferentes asignaturas.
public class Main {
    public static void main(String[] args) {

        int [] [] notas = {

                {7,4,9,5},  //alumno 1
                {5,5,2,10}, //alumno 2
                {4,2,1,6}   //alumno 3
        };

        System.out.println(Arrays.toString(mediaAlumnos(notas)));
    }

    //1. Calcular la nota media de cada alumno:
    //Escribe una función que reciba el array bidimensional de notas y devuelva un array de enteros que represente la nota media de cada alumno.
    //mediaAlumnos(int[][] array): int[]

    public static int[] mediaAlumnos (int[][] array){

        // creamos un array para guardar las medias (array.lenght = 3 )
        int [] media = new int[array.length];

        // array.lenght es el numero de filas es decir en una matriz de
        // 4x5 seria 4, si quieres que cuente las columnas seria array[0].lenght
        // asi le dices que cuente la distancia de una fila es decir, el numero de columnas

        for (int i = 0 ; i < array.length ; i++ ){
            //ponemos el int suma aqui para que se reinicie para cada alumno
            int suma = 0 ;


            for (int j = 0 ; j < array[0].length ; j++){

                // para sumar los numeros de una fila, empezamos con suma porque esta en 0 y luego las coordenadas de la matriz
                //
                suma = suma + array[i][j];
            }
            // antes de que se reinicio la suma a 0, anotamos la media de esta vuelta en el array media
            media[i] = suma / array[0].length;
        }
        return media;
    }
}