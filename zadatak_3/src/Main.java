public class Main {
    public static void main(String[] args){

        Trokut trokut = new Trokut(2, 3,4);
        Pravokutnik pravokutnik = new Pravokutnik(4,5);
        Krug krug = new Krug(3);


        System.out.println(trokut.getA());
        System.out.println(trokut.getB());
        System.out.println(trokut.getC());
        System.out.println(pravokutnik.getA());
        System.out.println(pravokutnik.getB());
        System.out.println(krug.getR());


    }
}