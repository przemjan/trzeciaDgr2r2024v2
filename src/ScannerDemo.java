import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        int numerButa;

        System.out.println("Podaj numer buta: ");
        numerButa = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj średnią z matmy: ");
        double average = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj swoje imię: ");
        String name = klawisz.nextLine();

        System.out.println("Twój numer buta: " + numerButa +
                ", średnia: " + average + ", twoje imię: " + name);

    }
}