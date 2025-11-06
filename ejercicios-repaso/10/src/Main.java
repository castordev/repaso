import java.util.Scanner;

//5: Se creará un número random del 56 al 108 e intentaremos adivinar cual es.
//El programa tendrá que pedirte dos números.

//   • El primero, cuando se pida por teclado se multiplicará por el número random.
//     Solo está permitido números impares mayores de 50.

//   • Se mostrará el resultado de la multiplicación

//   • El segundo número será tu intento para adivinar el número random

//Si has acertado, ganas el juego. Si no, sigues intentándolo de nuevo hasta un máximo de 3 intentos.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // siempre que queramos decirle a math random que nos calcule un numero entre n y m debemos seguir esta pauta
        // Math.random() * (m - n + 1 ) + n . siendo m el numero de mayor valor
        // si no le sumamos el +1 nos quedamos cortos en un numero porque (int) 0.99 = 0 ya que corta los decimales

        int random = (int) Math.random()*(108 - 56 + 1 ) + 56;

        // contador de intentos
        int intentos = 0;

        // final es una variable inmutable ya que no puede haber mas de 3 intentos
        final int maxIntentos = 3;


        while( intentos < maxIntentos){
            System.out.println("introduzca un numero impar mayor de 50:");
            int num = sc.nextInt();


            // usamos continue; si es falso para que vuelva al inicio del bucle y no siga leyendo mas codigo
            // asi creamos un loop hasta que se intruduzca un numero valido
            if(num <= 50 && num %2 == 0){
                System.out.println("numero no valido");
                continue;
            }

            System.out.println( "reultado de un numero random entre 56 y 108 multiplicado por su numero =  " + num * random);

            int resultado = num * random;

            System.out.println("adivine cual ha sido el numero random");
            int num2 = sc.nextInt();


            if(num2 == resultado){
                System.out.println("has acertado");
                break;

            }else{

                intentos ++;

                if(intentos <= maxIntentos){
                    System.out.println("vuelva a intentarlo");
                }else{
                    System.out.println("Ha perdido, el numero era "+ random );
                }

            }

        }


        sc.close();
    }
}