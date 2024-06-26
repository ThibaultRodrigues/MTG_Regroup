package siothibault.magic_regroupment;

public class Carte {
    private String name;
    private String color;
    private String img;
    private int force;
    private int defense;
    private int prix;


    public Carte(String name, String color, String img, int force, int defense,int prix) {
        this.name = name;
        this.color = color;
        this.img = img;
        this.force = force;
        this.defense = defense;
        this.prix = prix;
    }

    public String toString(){
        return this.img;
    }
    public String getName() {
        return this.name;
    }
    public String getImage(){return this.img;}
    public int getDefense() {
        return this.defense;
    }
    public int getForce(){
        return this.force;
    }
    public int getPrix() {return prix;}
}
