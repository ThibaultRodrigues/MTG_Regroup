package siothibault.magic_regroupment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public abstract class HelloApplication extends Application {


    public static void main(String[] args) {

        launch();

        ArrayList<Carte>  collection = new ArrayList<>();

        //Cartes de type Eau

        ArrayList<Carte> Eau = new ArrayList<>();

        Carte Ce1 = new Carte("le Guetteur de l eau","bleu","",9,9);
        Carte Ce2 = new Carte("Naida des eaux sombres","bleu","",2,2);
        Carte Ce3 = new Carte("élemental de marée","bleu","",0,4);
        Carte Ce4 = new Carte("sage des cascades","bleu","",2,5);
        Carte Ce5 = new Carte("Djinn Scribeciel","bleu","",3,4);
        Carte Ce6 = new Carte("Ondin des coraux","bleu","",2,1);
        Carte Ce7 = new Carte("Oracle des fonds marins","bleu","",2,3);
        Carte Ce8 = new Carte("Niblis de gel","bleu","",3,3);
        Carte Ce9 = new Carte("éclaireuse aquavente","bleu","",2,2);
        Carte Ce10 = new Carte("Subtilité","bleu","",3,3);

        //Cartes de type Feu

        ArrayList<Carte> Feu = new ArrayList<>();

        Carte Cf1 = new Carte("Olifant","rouge","",6,4);
        Carte Cf2 = new Carte("Eomer,Marshal of Rohan","rouge","",4,4);
        Carte Cf3 = new Carte("Servant de Feu","rouge","",4,3);
        Carte Cf4 = new Carte("Drakuseth,Gueule de Flammes","rouge","",7,7);
        Carte Cf5 = new Carte("Zalto,duc des géants de feu","rouge","",7,3);
        Carte Cf6 = new Carte("Rionya,danseuse du feu","rouge","",3,4);
        Carte Cf7 = new Carte("Solphim,Dominus du chaos","rouge","",5,4);
        Carte Cf8 = new Carte("Chandra,feu de Kaladesh","rouge","",2,2);
        Carte Cf9 = new Carte("Choeur de feu d'obsidienne","rouge","",4,4);
        Carte Cf10 = new Carte("dragon aux ailes-miroir","rouge","",4,5);

        //Cartes de type Lumière

        ArrayList<Carte> Lumiere = new ArrayList<>();

        Carte Cl1 = new Carte("Griffon d'abbaye","blanc","",2,2);
        Carte Cl2 = new Carte("Lamasu Absoluteur","blanc","",4,3);
        Carte Cl3 = new Carte("Iona, Bouclier d'Emeria","blanc","",7,7);
        Carte Cl4 = new Carte("paladin des accordeurs","blanc","",3,1);
        Carte Cl5 = new Carte("Gandalf,cavalier blanc","blanc","",3,3);
        Carte Cl6 = new Carte("Conquérant Charismatique","blanc","",2,2);
        Carte Cl7 = new Carte("Consécratrice du courage","blanc","",3,5);
        Carte Cl8 = new Carte("Gisela la lame brisée","blanc","",4,3);
        Carte Cl9 = new Carte("Avacyn, ange guardien","blanc","",5,4);
        Carte Cl10 = new Carte("Bruna, la lumière palissante","blanc","",5,7);

        Lumiere.add(Cl1); Lumiere.add(Cl2); Lumiere.add(Cl3); Lumiere.add(Cl4); Lumiere.add(Cl5); Lumiere.add(Cl6); Lumiere.add(Cl7); Lumiere.add(Cl8); Lumiere.add(Cl9); Lumiere.add(Cl10);


        //Cartes de type Rainbow

        ArrayList<Carte> Rainbow = new ArrayList<>();

        Carte Cr1 = new Carte("Aragorn, L'unificateur","rainbow","",5,5);
        Carte Cr2 = new Carte("Saruman le multicolor","rainbow","",5,4);
        Carte Cr3 = new Carte("Sauron,le seigneur ténébreux","rainbow","",7,6);
        Carte Cr4 = new Carte("Eowyn, la vierge Guerrière","rainbow","",5,4);
        Carte Cr5 = new Carte("Gandalf le gris","rainbow","",3,4);
        Carte Cr6 = new Carte("Aragorn et Arwen,époux","rainbow","",3,6);
        Carte Cr7 = new Carte("Arachne, fille d'Ungoliant","rainbow","",8,8);
        Carte Cr8 = new Carte("Arwen, reine mortelle","rainbow","",2,2);
        Carte Cr9 = new Carte("Frodon, hobbit audacieux","rainbow","",1,3);
        Carte Cr10 = new Carte("Le Balrog,Fléau de Durin","rainbow","",7,5);

        Rainbow.add(Cr1);
        Rainbow.add(Cr2);
        Rainbow.add(Cr3);
        Rainbow.add(Cr4);
        Rainbow.add(Cr5);
        Rainbow.add(Cr6);
        Rainbow.add(Cr7);
        Rainbow.add(Cr8);
        Rainbow.add(Cr9);
        Rainbow.add(Cr10);

        //Carte de type ténèbre

        ArrayList<Carte> Tenebre = new ArrayList<>();

        Carte Ct1 = new Carte("Démon de tourmental","noire","",4,5);
        Carte Ct2 = new Carte("Chirurgien des ténèbres","noire","",2,1);
        Carte Ct3 = new Carte("Héritière Falkenrath","noire","",2,1);
        Carte Ct4 = new Carte("Festoyeuse du Crépuscule","noire","",4,5);
        Carte Ct5 = new Carte("élite de Liliana","noire","",1,1);
        Carte Ct6 = new Carte("Grognarded'Olivia","noire","",2,2);
        Carte Ct7 = new Carte("Chevalier de l'effroi Markov","noire","",3,3);
        Carte Ct8 = new Carte("Seigneur de sang arrogant","noire","",4,4);
        Carte Ct9 = new Carte("Kinzu de Mornecouvent","noire","",5,4);
        Carte Ct10 = new Carte("Paladine parjure","noire","",1,1);

        //Carte de type vie

        ArrayList<Carte> Vie = new ArrayList<>();

        Carte Cv1 = new Carte("Dragon vert","vert","",4,4);
        Carte Cv2 = new Carte("La vieille Ronge-Os","vert","",7,7);
        Carte Cv3 = new Carte("Hydre aux écailles de mana","vert","",5,4);
        Carte Cv4 = new Carte("Engloutisseur Faucheur de Ciel","vert","",5,4);
        Carte Cv5 = new Carte("Intendant de Prédation","vert","",2,2);
        Carte Cv6 = new Carte("Protecteur du bois","vert","",4,6);
        Carte Cv7 = new Carte("vifsorbier, Ent impétueux","vert","",5,6);
        Carte Cv8 = new Carte("Polukranos Renaissant","vert","",4,5);
        Carte Cv9 = new Carte("Rénata, appelée à la chasse","vert","",4,3);
        Carte Cv10 = new Carte("Cavalier verdoyant","vert","",4,2);
    }
}