// SUMA DE DOS MATRICES DE IGUALES DIMENSIONES HACIENDO UNA FUNCION

public class Main {
    public static void main(String[] args) {

        int [][] matrixA = {
                {4,3,5},
                {3,7,1},
                {1,5,2}
        };

        int [][] matrixB = {
                {5,2,1},
                {0,3,8},
                {2,4,7}
        };

        // creamos una nueva matriz con la funcion de abajo para poder imprimirla por pantalla, ya que
        // necesitamos guardarla en una nueva matriz antes de esto

        int [][] suma = sumaMatrix(matrixA, matrixB);

        for (int i = 0 ; i < suma.length ; i++){
            for(int j = 0; j < suma[0].length ; j++){

                System.out.print(suma [i][j] + " ");

            }
            System.out.println(); // esta linea es importante para que salte de linea en cada fila
        }



    }

    // creamos una funcion matriz int [][] para devolver exactamente una matriz [][]
    // dentro de esa matriz ponemos dos matrices que significan las dos matrices que queremos sumar
    public static int [][] sumaMatrix (int [][] m1, int [][] m2 ){

        // creamos una matriz suma
        int [][] suma =new int[m1.length][m1[0].length];

        // recorremos la matriz
        for (int i = 0 ; i < m1.length ; i++  ){
            for (int j = 0 ; j < m1[0].length ; j++){

                // la suma es asi y punto
                suma [i][j] = m1[i][j] + m2[i][j];
            }
        }
        return suma;
    }


}