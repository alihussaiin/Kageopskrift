package Ingrediens;

public class Ingrediens {

    private String type;

    private double mængde;

    private String enhed;

    private double kcal;

    private int antalPersoner;

    private int nyAntal;

    private double vægtPrEnhed;

    public void setAntalPersoner(int antalPersoner) {
        this.antalPersoner = antalPersoner;
    }

    public int genAntalPersoner() {
    return antalPersoner; }

    public Ingrediens(String type, double mængde, String enhed, int antalPersoner) {
        this.type = type;
        this.mængde = mængde;
        this.enhed = enhed;
        this.antalPersoner = antalPersoner;
    }


    public String getType() {
        return type;
    }

    public double getMængde() {
        return mængde;
    }

    public String getenhed() {
        return enhed;
    }

    public int antalPersoner() {
        return antalPersoner;
    }
}

