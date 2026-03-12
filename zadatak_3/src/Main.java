public class Main {
    public static void main(String[] args){

        Trokut trokut = new Trokut("trokut",2, 3,4);
        Pravokutnik pravokutnik = new Pravokutnik("pravokutnik",4,5);
        Krug krug = new Krug( "krug",3);



        System.out.println(trokut.getA());
        System.out.println(trokut.getB());
        System.out.println(trokut.getC());
        System.out.println(pravokutnik.getA());
        System.out.println(pravokutnik.getB());
        System.out.println(krug.getR());
        System.out.println(trokut.getNaziv());
        System.out.println(pravokutnik.getNaziv());
        System.out.println(krug.getNaziv());
        System.out.println(krug.opseg());
        System.out.println(krug.povrsina());
        System.out.println(trokut.opseg());
        System.out.println(trokut.povrsina());
        System.out.println(pravokutnik.opseg());
        System.out.println(pravokutnik.povrsina());


    }
}