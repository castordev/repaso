
//2. Crea una función sumMatrix() que sume los elementos de una matriz y
//devuelva la suma.

public class Main {
    public static void main(String[] args) {

        int [][] matrix ={
                {4,5,1},
                {2,8,3}
        };


        System.out.println(matrixSuma(matrix));
    }

    public static int matrixSuma (int [][] matrixsuma){

        int suma = 0;

        for(int i = 0 ; i < matrixsuma.length ; i++){
            for (int j = 0 ; j < matrixsuma[0].length ; j++){
                suma = suma + matrixsuma[i][j];
            }
        }

        return suma;
    }

}