
//   Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de
//   28, 30 y 31 días.

import java.util.Scanner;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca una fecha");
        System.out.println("dia:");
        int dia = sc.nextInt();

        System.out.println("mes");
        int mes = sc.nextInt();

        System.out.println("año");
        int año = sc.nextInt();


        //hacemos un boolean para validar el de abajo

        boolean valido = fechavalida(año,mes,dia);

        if (valido){
            System.out.println(dia + " " + mes + " " + año + " es valido" );

        }else{
            System.out.println("Fecha no valida");
        }

    }

    // Hacemos una función que valide si la fecha es valida y devuelva un booleano

    public static boolean fechavalida (int año, int mes, int dia){

        // el mes tiene que estar entre el 1 y el 12
        if(mes <1 || mes >12) return false;

        // YearMonth es una clase de java que tiene almacenados los dias que tiene un mes segun el año
        YearMonth ym = YearMonth.of(año, mes);

        // Le decimos que los dias en un mes son iguales al lenght de ym, y hay que poner lenghtOfMonth
        // en vez de ym.lenght porque sabe dios pero si no, no funciona
        int diasEnMes = ym.lengthOfMonth();

        // que nos devuelta que si existe si el dia es mayor o igual a 1 y menor o igual a los dias de ese mes
        return dia >= 1 && dia <= diasEnMes;


    }




}