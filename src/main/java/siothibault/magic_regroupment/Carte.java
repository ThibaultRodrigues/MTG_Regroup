package siothibault.magic_regroupment;

public class Carte {
    private String name;
    private String color;
    private String img;
    private int force;
    private int defense;

    public Carte(String name, String color, String img, int force, int defense) {
    }

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
