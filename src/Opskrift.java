import Ingrediens.Ingrediens;

import java.util.ArrayList;

public class Opskrift {
    private int antalPersoner;
    private ArrayList<Ingrediens> ingredienser  = new ArrayList<>();

    public void udksrivIngredienser() {
        ingredienser.add( new Ingrediens("Mel", 0.250, "kg", 2));
        ingredienser.add ( new Ingrediens("Smeltet Smør", 3, "Spisesker", 2));
        ingredienser.add ( new Ingrediens("Æg", 2, "Styk", 2));
        ingredienser.add ( new Ingrediens("Salt", 2, "Tesker", 2));
        ingredienser.add ( new Ingrediens("Mælk", 1.5, "Deciliter", 2));
        ingredienser.add ( new Ingrediens("Gær", 25, "Gram", 2));
    }
    public Opskrift(int antalPersoner){
        this.antalPersoner = antalPersoner;

    }

    public int getAntalPersoner(){
        return antalPersoner;

    }

    public void setAntalPersoner(int antalPersoner){
        this.antalPersoner = antalPersoner;

    }

    @Override
    public String toString() {
        return "Opskrift{" +
                "antalPersoner=" + antalPersoner +
                ", ingrediensers=" + ingredienser +
                '}';
    }
}

//
