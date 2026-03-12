public class Krug extends GeometrijskiLik {

    double r;


    Krug(String naziv, double r) {
        super(naziv);
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    @Override
    public double povrsina() {
        return Math.PI * r * r;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * r;
    }
}