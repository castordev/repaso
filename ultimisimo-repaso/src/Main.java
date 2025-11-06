import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [][] matrix ={
                {4,5,1},
                {2,8,3}
        };

        int suma ;

        int [] columnas = new int[matrix.length];

        for( int i = 0 ; i < matrix.length ; i++){

            suma = 0;

            for (int j = 0; j < matrix[0].length; j++) {

            }
            suma = suma + matrix[i][0];
            columnas[i] = suma;
        }

        System.out.println(Arrays.toString(columnas));
    }
}