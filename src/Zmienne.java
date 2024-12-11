public class Zmienne {
    public static void main(String[] args) {
        int liczba;
        liczba = 13;

        double liczba2 = 17.7;

        System.out.println("Moja zmienna " + liczba + ", " + liczba2);

        int hours = 8;
        int days = 5;
        int weeks = 52;

        //komentarz
        int workHoursPerYear = days * hours * weeks;

        System.out.println("Wynik: " + workHoursPerYear);
        //ZŁY PRZYKŁAD!!
        //System.out.println("Wynik2 " + 5 * 4);


        char znak = '#';

        String napis = "Dzisiaj jest \"ładnie\"";
        napis += ".";

        System.out.println("Napis: " + napis);
        System.out.print("Napis: " + napis + "\n");
        System.out.print("Napis: " + napis);

        boolean sun = false; //true

        // https://github.com/przemjan/czwartaDgr2r2024

    }
}
