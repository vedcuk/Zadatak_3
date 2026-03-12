public class Pravokutnik extends GeometrijskiLik {

    double a;
    double b;


    Pravokutnik(String naziv, double a, double b) {
        super(naziv);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    @Override
    public double povrsina(){
        return a * b;
    }

    @Override
    public double opseg(){
        return 2 * (a + b);
    }
}

