package Entity;

public class Rettangolo {
    private double lato;
   private double altezza;

    public Rettangolo(){}

    public double calculatePerimetro(double l, double a){
        double result = (l+a)*2;
        return result;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}
