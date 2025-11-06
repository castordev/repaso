
public class Main {
    public static void main(String[] args) {

    }



    // Para los sensores infrarojos debemos devolver a que distancia está el objeto con
    // la famosa fórmula de distancia = velocidad * tiempo.
    //	Pero ojo, un rayo choca contra un objeto en X tiempo, pero ese rayo tiene que
    //	reflejarse de vuelta al sensor para saber que ha golpeado un objeto.
    //	Deduce la fórmula.

    public static double getDistance(double speed, double time) {

        double distance = speed * time;


        return distance/2;
    }


    //Un coche pasa por muchos sensores antes de darse como un coche válido. Esta función
    // es la que valida si un coche está bien fabricado o no.
    //	Para ello, se nos pasa como paráemtro un array de todas las probabilidades de
    //	los sensores que ha pasado. Cuanta más probabilidad, más ha detectado
    //	el sensor que algo ha podido ir mal. Si la media de los sensores es inferior a
    //	10% se da como un coche bien fábricado.


    public static boolean isValidCar(double[] sensorProbability) {

        double suma = 0;

        for (int i = 0; i < sensorProbability.length; i++) {
            suma = suma + sensorProbability[i];

        }

        if (suma / sensorProbability.length < 10) {
            return true;
        } else return false;
    }



    //Esta función se le envía como parámetro un objeto bien creado (pattern) y el objecto que está
    // visualizando el sensor en esos momentos.
    //	Al ser una imagen, esta función necesita devolver que probabilidad tiene el objeto de estar
    //	bien creado con respecto a su patrón.
    //	¿Cómo hacerlo? Necesitamos saber cuantos pixeles tienen las imagenes (ambas tendrán el mismo
    //	tamañano) y cuantos pixeles son distintos entre ellos.
    //	Devolver el porcentaje de pixeles distintos.

    public static double checkObjectWithPatternBlackAndWhite(boolean[][] pattern, boolean[][] object) {

        int cont = 0;

        for( int i = 0 ; i < pattern.length ; i++) {
            for (int j = 0; j < pattern[0].length; j++) {

                if (pattern[i][j] != object[i][j]) {
                    cont++;
                }
            }
        }

        int matrixPixels = pattern.length * pattern[0].length;

        return ((double) cont /matrixPixels)*100;
    }




//  Esta función es exactamente igual que la anterior pero neceistamos que sea a color.
//  Para ellos, en vez de true o false, ahora los pixeles van de 0 a 255.
//	Determinamos que un pixel es distinto a otro si la diferencia es mayor que 10.


    public static double checkObjectWithPatternColour(int[][] pattern, int[][] object) {

        int cont = 0;

        for( int i = 0 ; i < pattern.length ; i++) {
            for (int j = 0; j < pattern[0].length; j++) {

                if (pattern[i][j] < (object[i][j])-10 || pattern[i][j] > (object[i][j])+10 ) {
                    cont++;
                }
            }
        }

        int matrixPixels = pattern.length * pattern[0].length;

        return ((double) cont /matrixPixels)*100;

    }
}