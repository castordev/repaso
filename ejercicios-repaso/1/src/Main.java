import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean HayNegativo = false;

        for(int i = 0 ; i < 5 ; i++){

            int num = sc.nextInt();

            if ( num < 0){
                HayNegativo = true;
            }

        }

        if (HayNegativo){
            System.out.println("hay negativo");
        }else{
            System.out.println("no hay negativo");
        }

        sc.close();

    }
}