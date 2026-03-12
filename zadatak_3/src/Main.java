public class Main {
    public static void main(String[] args){

        Trokut trokut = new Trokut("trokut",2, 3,4);
        Pravokutnik pravokutnik = new Pravokutnik("pravokutnik",4,5);
        Krug krug = new Krug( "krug",3);

        Ucilica ucilica = new Ucilica();

        ucilica.dodaj(new Krug("Krug2", 6));
        ucilica.dodaj(new Krug("Krug3",2));
        ucilica.dodaj(new Pravokutnik ("Prav2", 5,9));
        ucilica.dodaj(new Trokut("Trok2", 2,5,6));

        ucilica.ispisiSve();
        ucilica.sortirajPoPovrsini();

        System.out.println("Sortirano po površini: \n");
        ucilica.ispisiSve();




    }
}