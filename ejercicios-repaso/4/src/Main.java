


//: Realizar una aplicación que devuelva si una palabra es un palíndromo o no

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");

        String palabra = sc.nextLine();

        String reverse = "";

        // lenght -1 porque la distancia por ejemplo puede ser 5, pero si el array cuenta de 0 a 4, "i" no va a llegar
        // nunca al numero 5

        // i >= 0 para que lea 0 porque

        // reverse = reverse + palabra.charAt(i); esto lo ponemos porque si pusieras solo reverse = palabra.charAt(i);
        // no te guardaria las letras ya que solo saldria la ultima letra del bucle, si por ejemplo la palabra fuera
        // "hola" solo saldría la a, o la h en este caso por ser la lectura al reves
        // por lo que si ponemos reverse + palabra.charAt(i); le estamos diciendo que guarde cada vuelta del bucle
        // en la variable que declaramos arriba String reverse = ""; para así conseguir una palabra completa
        // también se puede poner reverse += palabra.charAt(i); ya que += significa reverse = reverse +

        for(int i = palabra.length()-1 ; i >= 0; i--){

            reverse = reverse + palabra.charAt(i);
        }

        // usamos equals y no == porque equals compara el contenido de la String mientras == compara si dos
        // objetos apuntan al mismo lugar en la memoria ( mejor usar == solo para numeros jeje)

        if (palabra.equals(reverse)){
            System.out.println("es palindromo");

        }else{
            System.out.println("no es palindromo");
        }

        sc.close();
    }
}