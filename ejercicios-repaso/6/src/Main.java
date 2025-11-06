
//   Pedir números indefinidamente. A medida que se piden números solo queremos
//   mostrar los que cumplan al menos uno de los siguientes requisitos:
//     • Requisito 1: Que sea par y que al multiplicarlo por 5 sea mayor que 25
//     • Requisito 2: Que sea impar y que al multiplicarlo por 3 sea menor que 10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui usamos un while porque al meter numeros indefinidamente por la consola el for no nos vale

        while (true){
            System.out.println("Ingrese un numero");

            int numero = sc.nextInt();

            // if(numero == 0 ){
            // sout ( "programa terminado);
            // break;
            // }
            // esto lo pondriamos si quisieramos que el 0 acabe con el bucle


            boolean requisito1 = (numero %2 == 0) && (numero * 5 > 25);
            boolean requisito2 = (numero %2 != 0) && (numero * 3 < 10);


            if(requisito1){
                System.out.println("cumple requisito 1 ");
            }else if(requisito2){
                System.out.println("cumple el requisito 2");
            }else{
                System.out.println(" no cumple requisitos");
            }

        }

    }

}
