

public class Main {
    public static void main(String[] args) {

        int [][] matrix ={
                {4,5,1,3},
                {2,8,3,4},
                {7,3,2,1},
                {2,3,9,1}
        };


    }

    public static int [] diagonal ( int [][] matrix){

        int diagonal = (matrix.length-1) * (matrix.length-1);

        int [] array = new int[diagonal];


        for( int i = 0 ; i < matrix.length ; i++){
            for(int j = i+1 ; j < matrix[0].length-1 ; j++){

                array[j] = array[j]+1;
            }
        }


    }
}