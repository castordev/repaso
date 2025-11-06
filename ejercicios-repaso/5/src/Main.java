import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Math.random() genera un numero entre 0.0 y 0.9
        // Al multiplicar por 5 lo llevamos hasta 4.99
        // al convertirlo en (int) lo llevamos a un entero olvidandonos del 0.99 asi nos queda 4
        // le sumamos +1 , y nos queda un rango de entre 1 y 5

        int nMaquina = (int) (Math.random()*5)+1;

        int nPlayer ;

        String parono ;


    }
}