

// Devuelve que fila contiene la suma mas alta

public class Main {
    public static void main(String[] args) {


        int [][] matrix ={
                {5,89,4},
                {56,100,3},
                {3,98,10}
        };


        System.out.println(getMaxRow(matrix));

    }

    public static int getMaxRow ( int[][] matrix){

        int suma ;
        int max = 0;
        int fila = 0;

        for(int i = 0 ; i < matrix.length ; i++){

            // importante aqui suma = 0 para reiniciar la suma a cada vuelta

            suma = 0;
            for(int j = 0 ; j < matrix[0].length ; j++){

                // sumamos la fila, como empieza en suma = 0 , la primera suma es solo el valor de la coordenada
                suma = suma + matrix[i][j];

                // si suma es mayor que el valor de max, max pasa a tener el mismo valor que la suma
                if(suma > max){
                    max = suma;

                    // dentro de el bucle si esto se cumple entonces marcamos la fila en la que suma > max
                    fila = i;
                }
            }
        }

        //fila + 1 porque empieza en 0, pero no queremos llamarla fila numero 0 si no fila numero 1
        return fila + 1;

    }
}