import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            num = sc.nextInt();

            if (num %3 == 0){
                System.out.println("es multiplo");
            }else{
                System.out.println("no es multiplo");
            }

        }while(num != -1);


    }
}