package siothibault.premier_jeu_mtg;

public class Carte {
    private String name;
    private String color;
    private String img;
    private int force;
    private int defense;

    public String getName() {
        return this.name;
    }
    public int getDefense() {
        return this.defense;
    }
    public int getForce(){
        return this.force;
    }
}
